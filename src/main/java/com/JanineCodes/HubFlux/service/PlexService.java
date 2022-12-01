package com.JanineCodes.HubFlux.service;

import com.JanineCodes.HubFlux.model.Plex;

import java.util.List;

public interface PlexService {
    public Plex savePlex(Plex plex);
    public List<Plex> getAllPlexData();
}
