package com.JanineCodes.HubFlux.model;

import javax.persistence.*;

@Entity
public class StreamService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "Name")
    private String name;

    @Column(name = "IMDBMovie")
    private String imdbMovie;

    @Column(name = "ImageLocation")
    private String imageLocation;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImdbMovie() {
        return imdbMovie;
    }

    public void setImdbMovie(String imdbMovie) {
        this.imdbMovie = imdbMovie;
    }

    public void setImageLocation(String location){this.imageLocation = location;}

    public String getImageLocation() {
        return imageLocation;
    }


}
