package com.JanineCodes.HubFlux.service;

import com.JanineCodes.HubFlux.model.StreamService;
import com.JanineCodes.HubFlux.repository.StreamServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamServiceImpl implements StreamServiceService {

    private StreamServiceRepository streamServiceRepository;

    @Autowired
    public void setStreamServiceRepository(StreamServiceRepository streamServiceRepository){
        this.streamServiceRepository = streamServiceRepository;
    }


    @Override
    public void savePlex(StreamService plex) {
        streamServiceRepository.save(plex);
    }

    @Override
    public List<StreamService> getAllPlexData() {
        return streamServiceRepository.findAll();
    }






}
