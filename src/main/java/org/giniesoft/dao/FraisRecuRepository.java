package org.giniesoft.dao;

import org.giniesoft.entities.FraisRecu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface FraisRecuRepository extends JpaRepository<FraisRecu, Long>{

}
