package com.JanineCodes.HubFlux.controller;

import com.JanineCodes.HubFlux.model.StreamService;
import com.JanineCodes.HubFlux.service.StreamServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
//@RequestMapping("/")
public class ServiceController {
    @Autowired
    private StreamServiceService plexService;

    @PostMapping("/add")
    public String add(@RequestBody StreamService streamService)
    {
        plexService.savePlex(streamService);
        return "new Plex is Added";
    }

    @GetMapping("/getAll")
    public List<StreamService> getAllPlexData()
    {
        return plexService.getAllPlexData();
    }

    @GetMapping("/stream-services")
    public List<StreamService> GetStreamingServicesData()
    {
        return plexService.getStreamServiceData();
    }
}
