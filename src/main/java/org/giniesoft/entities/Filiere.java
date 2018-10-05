package org.giniesoft.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filiere implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomAr;
	private String nomFr;
	private int duree;
	private String diplomeAr;
	private String diplomeFr;
	private String niveauAdmission;
	private Date dateAutorisation;
	private String numAutorisation;
	private Date DateQualification;
	private String numQualification;
	private Date DateAccreditation;
	private String numAccreditation;
	private String stage1;
	private String stage2;
	@OneToMany(mappedBy="filiere")
	private Collection<Scolarite> scolarites;
	@OneToMany(mappedBy="filiere")
	private Collection<Programme> programmes;
	
	
}
