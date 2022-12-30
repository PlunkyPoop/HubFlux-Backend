package com.JanineCodes.HubFlux.controller;

import com.JanineCodes.HubFlux.model.StreamService;
import com.JanineCodes.HubFlux.repository.StreamServiceRepository;
import com.JanineCodes.HubFlux.service.StreamServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/")
public class ServiceController {
    @Autowired
    private StreamServiceService plexService;
    @Autowired
    private StreamServiceRepository streamServiceRepository;

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
    public ResponseEntity<Object> GetStreamingServicesData()
    {
        try {
            HttpHeaders headers = new HttpHeaders();
            return ResponseEntity.ok().headers(headers).body(streamServiceRepository.findAll());
        }
        catch (IMDBController.ExpectedException exception){
            exception.printStackTrace();
            return new ResponseEntity("Error!, Please try again", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get-service/{name}")
    public ResponseEntity<Object> GetSpecificStreamService(@PathVariable String name)
    {
        try {
            HttpHeaders headers = new HttpHeaders();
            return ResponseEntity.ok().headers(headers).body(streamServiceRepository.findStreamServiceByName(name));
        }
        catch (IMDBController.ExpectedException exception){
            exception.printStackTrace();
            return new ResponseEntity("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/put/streamservice/{streamId}")
    public ResponseEntity<StreamService> GetSpecificStreamService(@RequestBody StreamService editedStreamService, @PathVariable Long streamId) {
    try{
        StreamService updatedSteamService = streamServiceRepository.findById(streamId)
                .orElseThrow(() -> new InvalidConfigurationPropertyValueException("id: ", streamId, "Cannot find anything with this id"));
        updatedSteamService.setName(editedStreamService.getName());
        updatedSteamService.setImdbMovie(editedStreamService.getImdbMovie());
        updatedSteamService.setImageLocation(editedStreamService.getImageLocation());
        streamServiceRepository.save(updatedSteamService);

    } catch (InvalidConfigurationPropertyValueException e) {
        throw new RuntimeException(e);
    }

        return new ResponseEntity("It worked!", HttpStatus.OK);

    }

    @PostMapping("/post/streamservice")
    public ResponseEntity<StreamService> NewStreamingService(@RequestBody StreamService newStreamService) {
        try{
            StreamService newStreamServiceData = new StreamService();

            newStreamServiceData.setName(newStreamService.getName());
            newStreamServiceData.setImdbMovie(newStreamService.getImdbMovie());
            newStreamServiceData.setImageLocation(newStreamService.getImageLocation());
            streamServiceRepository.save(newStreamService);

        } catch (InvalidConfigurationPropertyValueException e) {
            throw new RuntimeException(e);
        }

        return new ResponseEntity("It worked!", HttpStatus.OK);

    }

    @DeleteMapping("/delete/streamservice/{streamId}")
    public ResponseEntity<StreamService> DeleteStreamService(@PathVariable Long streamId) {

        StreamService toDelete = streamServiceRepository.findById(streamId)
                .orElseThrow(() -> new InvalidConfigurationPropertyValueException("id: ", streamId, "Cannot find anything with this id"));

        try
        {
            streamServiceRepository.delete(toDelete);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new ResponseEntity("Record is deleted!", HttpStatus.OK);

    }
}
