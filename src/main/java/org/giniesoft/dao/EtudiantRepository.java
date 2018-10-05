package org.giniesoft.dao;

import java.util.List;

import org.giniesoft.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	public List<Etudiant> findByNomFrContains(String nom);
	
	@Query("select e from Etudiant e where e.nomFr like :mc or e.prenomFr like :mc")
	public List<Etudiant> chercher(@Param("mc")String motCle);
	
	@Query("select e from Etudiant e where e.filiere.id= :x")
	public List<Etudiant> chercherParFiliere(@Param("x")Long idFiliere);
	
	

}
