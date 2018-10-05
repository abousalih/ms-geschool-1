package org.giniesoft.dao;

import org.giniesoft.entities.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface MatiereRepository extends JpaRepository<Matiere, Long>{

}
