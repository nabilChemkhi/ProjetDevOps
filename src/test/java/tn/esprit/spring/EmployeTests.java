package tn.esprit.spring;

import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeTests {
	private static final Logger l=LogManager.getLogger(EmployeTests.class);
	//load contexts
		@Test
			public void contextLoads() {
			}
	@Autowired
	 IEmployeService employeservice;
	@Test(timeout = 5000)
	public void ajouterEmployeTest(){
	
		
			Employe e=new Employe("benour","amin","mohamedamine.benour@esprit.tn",true,Role.ADMINISTRATEUR);
			employeservice.ajouterEmploye(e);
			
			assertNotNull(employeservice.ajouterEmploye(e));
	}
	
	@Test(timeout = 5000)
	public void ajouterContratTest() throws ParseException{
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d = dateFormat.parse("2015-03-23");
			Contrat e=new Contrat(d,"test",2);
			employeservice.ajouterContrat(e);
			
			assertNotNull(employeservice.ajouterContrat(e));
	}
	

}
