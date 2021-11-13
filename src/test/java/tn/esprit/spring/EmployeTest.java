package tn.esprit.spring;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;


//@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeTest {
	private static final Logger l=LogManager.getLogger(EmployeTest.class);

	//load contexts
		@Test
		public void contextLoads() {
		}
		@Autowired
		 IEmployeService employeservice;
		/*	@Test(timeout = 5000)
	public void ajouterEmployeTest(){
		
			//test pour ajout entreprise
				Employe e=new Employe();
				employeservice.ajouterEmploye(e);
				
				assertNotNull(employeservice.ajouterEmploye(e));
		}*/
}

