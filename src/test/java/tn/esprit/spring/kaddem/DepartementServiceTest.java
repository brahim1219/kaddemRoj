package tn.esprit.spring.kaddem;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.entities.Universite;
import tn.esprit.spring.kaddem.services.IDepartementService;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DepartementServiceTest {
    @Autowired
    IDepartementService departementService;
    @Test()
    @Order(1)
    public void addDepar(){
        List<Departement> DepartementList=departementService.retrieveAllDepartements();

        Departement universite=new Departement("rii");
        Departement univ= departementService.addDepartement(universite);
        List<Departement> universiteList1=departementService.retrieveAllDepartements();
        Assertions.assertEquals(DepartementList.size()+1,universiteList1.size());
    }

    @Test()
    @Order(2)
    public void retirveDepar(){
        List<Departement> departements=departementService.retrieveAllDepartements();
        Assertions.assertEquals(departements.size(),departements.size());

    }
}
