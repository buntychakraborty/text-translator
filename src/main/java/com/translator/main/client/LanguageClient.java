package com.translator.main.client;


import com.translator.main.model.Language;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "https://google-translate20.p.rapidapi.com",name = "language-client")
public interface LanguageClient {

    @GetMapping(value = "/languages")
    public Language getLanguages(@RequestHeader(value = "x-rapidapi-host") String xRapidApiHost,
                                 @RequestHeader(value="x-rapidapi-key") String xRapidApiKey);

}
