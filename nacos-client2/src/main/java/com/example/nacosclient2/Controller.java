package com.example.nacosclient2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Autowired
    private  RestTemplate restTemplate;

    @GetMapping("/getForRibbon")
    public String sendRibbon(){
        String result = restTemplate.getForObject("http://client-1/getOk", String.class);
        return result;
    }
}
