package com.JanineCodes.HubFlux.service;


import com.JanineCodes.HubFlux.model.IMDB;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IMDBService {


    public IMDB FindEverything(String key)
    {
        String uri = "https://imdb-api.com/en/API/Title/k_09ihshh8/" + key;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, IMDB.class);
    }


}
