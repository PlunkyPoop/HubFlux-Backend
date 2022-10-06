package com.JanineCodes.HubFlux.controller;

import com.JanineCodes.HubFlux.model.Plex;
import com.JanineCodes.HubFlux.service.PlexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://local:3000")
@RequestMapping("/plex")
public class PlexController {
    @Autowired
    private PlexService plexService;

    @PostMapping("/add")
    public String add(@RequestBody Plex plex)
    {
        plexService.savePlex(plex);
        return "new Plex is Added";
    }

    @GetMapping("/getAll")
    public List<Plex> getAllPlexData()
    {
        return plexService.getAllPlexData();
    }
}
