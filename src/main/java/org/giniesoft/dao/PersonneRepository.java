package org.giniesoft.dao;

import org.giniesoft.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface PersonneRepository extends JpaRepository<Personnel, Long>{

}
