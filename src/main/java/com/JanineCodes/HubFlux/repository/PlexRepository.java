package com.JanineCodes.HubFlux.repository;

import com.JanineCodes.HubFlux.model.Plex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlexRepository extends JpaRepository<Plex,Integer> {

}
