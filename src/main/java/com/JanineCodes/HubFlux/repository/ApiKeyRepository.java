package com.JanineCodes.HubFlux.repository;

import com.JanineCodes.HubFlux.model.ApiKeys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiKeyRepository extends JpaRepository<ApiKeys,Integer> {
}
