package org.giniesoft.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String civilite;
	private String nomAr;
	private String nomFr;
	private String prenomAr;
	private String prenomFr;
	private Date dateNaissance;
	private String lieuNaissanceAr;
	private String lieuNaissanceFr;
	private String adresseAr;
	private String adresseFr;
	private String villeAr;
	private String villeFr;
	private String email;
	private String tel;
	private String cin;
	private String dernierDiplomeAr;
	private String dernierDiplomeFr;
	private String anneeObtention;
	private String dernierEtablissementAr;
	private String dernierEtablissementFr;
	private String cne;
	private String nationaliteAr;
	private String nationaliteFr;
	private String urlPhoto;
	private String urlExtrait;
	private String urlCin;
	private String urlAttestation;
	private String tuteur;
	private String telTuteur;
	private double fraisInscription;
	private double fraisMensuel;
	private double fraisExamen;
	private double fraisDiplome;
	private String numInscription;
	private Date dateInscription;
	@ManyToOne
	private Filiere filiere;
	@OneToMany(mappedBy="etudiant")
	private Collection<Scolarite> scolarites;
	
	 
}
