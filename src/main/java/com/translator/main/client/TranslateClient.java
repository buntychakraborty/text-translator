package com.translator.main.client;

import com.translator.main.model.response.TranslatedDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url="https://google-translate20.p.rapidapi.com",name = "translate-client")
public interface TranslateClient {
    @GetMapping("/translate")
    public TranslatedDTO getTransaltedText(@RequestHeader(value = "x-rapidapi-host") String xRapidApiHost,
                                           @RequestHeader(value="x-rapidapi-key") String xRapidApiKey,@RequestParam("sl")  String sl,@RequestParam("text") String text,
                                           @RequestParam String tl);

}


//https://google-translate20.p.rapidapi.com/translate?sl=en&text=hello&tl=bn