package com.JanineCodes.HubFlux.service;

import com.JanineCodes.HubFlux.model.Plex;
import com.JanineCodes.HubFlux.repository.PlexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlexServiceImpl implements PlexService{

    @Autowired
    private PlexRepository plexRepository;

    @Override
    public Plex savePlex(Plex plex) {
        return plexRepository.save(plex);
    }

    @Override
    public List<Plex> getAllPlexData() {
        return plexRepository.findAll();
    }
}
