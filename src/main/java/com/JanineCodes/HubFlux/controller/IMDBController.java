package com.JanineCodes.HubFlux.controller;

import com.JanineCodes.HubFlux.model.IMDB;
import com.JanineCodes.HubFlux.service.IMDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class IMDBController {



    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Expected!")
    static class ExpectedException extends RuntimeException {
    }

    @Autowired
    private IMDBService imdbService;

    @GetMapping("/imdbData")
    public ResponseEntity<?> getEverything()
    {
        try {
        return new ResponseEntity(imdbService.FindEverything(), HttpStatus.OK);

        }
        catch (ExpectedException exception){
            exception.printStackTrace();
            return new ResponseEntity("Error!, Please try again", HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

//
//    Also works
//    @GetMapping(value = "/imdb")
//    public IMDB getStudentObject()
//    {
//
//        String uri = "https://imdb-api.com/en/API/Title/k_36n11qz4/tt11198350";
//        RestTemplate restTemplate = new RestTemplate();
//        IMDB result = restTemplate.getForObject(uri, IMDB.class);
//        return result;
//
//    }


    }


