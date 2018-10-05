package org.giniesoft.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Intitule implements Serializable{

	@Id
	@GeneratedValue
	
	private Long id;
	private String intituleAr;
	private String intituleFr;
}
