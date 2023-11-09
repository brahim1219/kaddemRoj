package tn.esprit.spring.kaddem;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Universite;
import tn.esprit.spring.kaddem.services.DepartementServiceImpl;
import tn.esprit.spring.kaddem.services.UniversiteServiceImpl;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UniversiteServiceTest {
    @Autowired
    UniversiteServiceImpl universiteService;
    @Test()
    @Order(1)
    public void addUniv(){
        List<Universite> universiteList=universiteService.retrieveAllUniversites();

        Universite universite=new Universite("rii");
       Universite univ= universiteService.addUniversite(universite);
        List<Universite> universiteList1=universiteService.retrieveAllUniversites();
        Assertions.assertEquals(universiteList.size()+1,universiteList1.size());

    }

    @Test()
    @Order(2)
    public void retirveUniv(){
        Assertions.assertEquals(universiteService.retrieveAllUniversites().size(),universiteService.retrieveAllUniversites().size());

    }
}
