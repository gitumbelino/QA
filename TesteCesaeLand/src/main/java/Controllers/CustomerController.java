package Controllers;

import Domain.Attractions;
import Model.AttractionsRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustomerController {
    AttractionsRepository attractionsRepository;


    public CustomerController() throws FileNotFoundException {
        this.attractionsRepository= new AttractionsRepository("src/main/resources/Cesaeland_atracoes.csv");
    }

    public ArrayList<Attractions> getAttractionsList() {
        return this.attractionsRepository.getAttractionList();
    }

}



