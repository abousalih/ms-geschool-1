package org.giniesoft.dao;

import java.util.List;

import org.giniesoft.entities.Scolarite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ScolariteRepository extends JpaRepository<Scolarite, Long> {

	@Query("select s from Scolarite s where s.filiere.id=:x and s.anneeScolaire like :y")
	public List<Scolarite> chercherParFiliereEtAnnee(
			@Param("x") Long idFiliere,
			@Param("y") String anneeScoalaire
			);

}
