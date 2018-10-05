package org.giniesoft.dao;

import org.giniesoft.entities.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FiliereRepository extends JpaRepository<Filiere, Long> {

}
