package com.JanineCodes.HubFlux.service;

import com.JanineCodes.HubFlux.model.StreamService;

import java.util.List;

public interface StreamServiceService {
    void savePlex(StreamService streamService);
    List<StreamService> getAllPlexData();

}
