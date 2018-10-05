package org.giniesoft.dao;

import org.giniesoft.entities.Attestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AttestationRepository extends JpaRepository<Attestation, Long>{

}
