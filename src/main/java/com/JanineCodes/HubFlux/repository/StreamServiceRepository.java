package com.JanineCodes.HubFlux.repository;

import com.JanineCodes.HubFlux.model.StreamService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamServiceRepository extends JpaRepository<StreamService,Integer> {

}
