package com.JanineCodes.HubFlux.controller;
import com.JanineCodes.HubFlux.service.IMDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class IMDBController {



    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Expected!")
    static class ExpectedException extends RuntimeException {
    }

    @Autowired
    private IMDBService imdbService;

    @GetMapping("/imdbData/{key}")
    public ResponseEntity<Object> getEverything(@PathVariable String key)
    {
        try {
            HttpHeaders headers = new HttpHeaders();
        return ResponseEntity.ok().headers(headers).body(imdbService.FindEverything(key));
        }
        catch (ExpectedException exception){
            exception.printStackTrace();
            return new ResponseEntity("Error!, Please try again", HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    }


