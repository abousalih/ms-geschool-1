package org.giniesoft.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diplome implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String niveauDiplomeAr;
	private String niveauDiplomeFr;
	private String numDiplome;
	private String numSerie;
	private Date pvJury;
	private String promotion;
	private String villeAr;
	private String villeFr;
	private Date dateEdition;
	@ManyToOne
	private Filiere filiere;
	private Etudiant etudiant;

}
