package org.giniesoft.dao;

import java.util.List;

import org.giniesoft.entities.Programme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ProgrammeRepository extends JpaRepository<Programme, Long>{

	@Query("select p from Programme p where p.filiere.id=:x and p.anneeScolaire like :y")
	public List<Programme> getListMatiereParFiliereEtAnne(
			@Param("x") Long idFiliere,
			@Param("y")String anneeScolaire);
}
