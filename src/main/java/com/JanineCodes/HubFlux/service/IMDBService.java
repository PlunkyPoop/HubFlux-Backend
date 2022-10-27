package com.JanineCodes.HubFlux.service;


import com.JanineCodes.HubFlux.model.IMDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IMDBService {


    public IMDB FindEverything()
    {
        String uri = "https://imdb-api.com/en/API/Title/k_36n11qz4/tt11198350";
        RestTemplate restTemplate = new RestTemplate();
        IMDB result = restTemplate.getForObject(uri, IMDB.class);
        return result;
    }


}
