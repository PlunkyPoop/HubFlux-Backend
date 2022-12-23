package com.JanineCodes.HubFlux.service;

import com.JanineCodes.HubFlux.model.StreamService;

import java.util.List;

public interface StreamServiceService {
    public StreamService savePlex(StreamService streamService);
    public List<StreamService> getAllPlexData();
    public List<StreamService> getStreamServiceData();

}
