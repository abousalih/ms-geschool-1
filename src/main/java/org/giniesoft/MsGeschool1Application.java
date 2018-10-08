package org.giniesoft;

import java.util.Date;

import org.giniesoft.dao.EtudiantRepository;
import org.giniesoft.dao.FiliereRepository;
import org.giniesoft.entities.Etudiant;
import org.giniesoft.entities.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsGeschool1Application implements CommandLineRunner {

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	private FiliereRepository formationRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MsGeschool1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Filiere f1=new Filiere();
		Filiere f2=new Filiere();
		Filiere f3=new Filiere();
		Filiere f4=new Filiere();
		Filiere f5=new Filiere();
		Filiere f6=new Filiere();
		
		f1.setNomFr("TSDI");
		f2.setNomFr("TSGE");
		f3.setNomFr("TGI");
		f4.setNomFr("TSRI");
		f5.setNomFr("SID");
		f6.setNomFr("LICDA");
		
		formationRepository.save(f1);
		formationRepository.save(f2);
		formationRepository.save(f3);
		formationRepository.save(f4);
		formationRepository.save(f5);
		
		Etudiant e1=new Etudiant();
		e1.setNomFr("Abousalih");
		e1.setPrenomFr("Lahcen");
		
		Etudiant e2=new Etudiant();
		e2.setNomFr("Abousalih");
		e2.setPrenomFr("Saad");
		
		Etudiant e3=new Etudiant();
		e3.setNomFr("Abousalih");
		e3.setPrenomFr("ziyad");
		
		Etudiant e4=new Etudiant();
		e4.setNomFr("Abousalih");
		e4.setPrenomFr("Hajar");
		
		Etudiant e5=new Etudiant();
		e5.setNomFr("El aroussi");
		e5.setPrenomFr("Nasrine");
		
		etudiantRepository.save(e1);
		etudiantRepository.save(e2);
		etudiantRepository.save(e3);
		etudiantRepository.save(e4);
		etudiantRepository.save(e5);
	}
}
