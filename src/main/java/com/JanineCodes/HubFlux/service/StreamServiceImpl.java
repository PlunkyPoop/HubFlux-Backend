package com.JanineCodes.HubFlux.service;

import com.JanineCodes.HubFlux.model.StreamService;
import com.JanineCodes.HubFlux.repository.StreamServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamServiceImpl implements StreamServiceService {

    @Autowired
    private StreamServiceRepository streamServiceRepository;

    @Override
    public StreamService savePlex(StreamService plex) {
        return streamServiceRepository.save(plex);
    }

    @Override
    public List<StreamService> getAllPlexData() {
        return streamServiceRepository.findAll();
    }

    @Override
    public List<StreamService> getStreamServiceData() {
        return streamServiceRepository.findAll();
    }
}
