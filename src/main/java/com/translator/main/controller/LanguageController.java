package com.translator.main.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.translator.main.client.LanguageClient;
import com.translator.main.client.TranslateClient;
import com.translator.main.model.Data;
import com.translator.main.model.Language;
import com.translator.main.model.Response;
import com.translator.main.model.TranslatedResponse;
import com.translator.main.model.response.TranslatedDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Map;

@RestController
public class LanguageController {
    @Autowired
    private LanguageClient languageClient;

    @Autowired
    private TranslateClient translateClient;

    @Value("${apiHost}")
    private String apiHost;

    @Value("${apiKey}")
    private String apiKey;

    public static Map<String, String> map;
  public static  Language languages ;

    // Rest call using feign client

    @PostConstruct
    public  void getLanguagesAtDeploymentTime(){
        languages = languageClient.getLanguages(apiHost, apiKey);
        Data data = languages.getData();
        ObjectMapper oMapper = new ObjectMapper();
        map = oMapper.convertValue(data, Map.class);
        map.remove("auto");
    }


    @GetMapping("/")
    public ModelAndView getLanguages() throws IOException {
        ModelAndView modelAndVeiewForIndex = new ModelAndView("index");
        System.out.println("hello");
        modelAndVeiewForIndex.addObject("map", map);
        modelAndVeiewForIndex.addObject("response", new Response());
        return modelAndVeiewForIndex;
    }

    @PostMapping("/translate")
    public ModelAndView translate(@ModelAttribute Response response) {
        ModelAndView modelAndVeiew = new ModelAndView("translation");
        TranslatedDTO transaltedText = translateClient.getTransaltedText(apiHost, apiKey, response.getConvertFrom(), response.getText(), response.getConvertedTo());
        TranslatedResponse res = new TranslatedResponse();
        res.setConvertedTo(map.get(response.getConvertedTo()));
        res.setConvertFrom(map.get(response.getConvertFrom()));
        res.setTranslatedText(transaltedText.getData().getTranslation());
        res.setText(response.getText());
        res.setPronunciation(transaltedText.getData().getPronunciation());
        modelAndVeiew.addObject("response", res);
        return modelAndVeiew;
    }
}
