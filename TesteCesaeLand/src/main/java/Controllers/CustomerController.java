package Controllers;

import Domain.Attractions;
import Model.AttractionsRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustomerController {

    AttractionsRepository attractionsRepository;

    public CustomerController(String filePathAttractions) throws FileNotFoundException {
        this.attractionsRepository= new AttractionsRepository(filePathAttractions);
    }


    public ArrayList<Attractions> getAttractionsList() {
        return this.attractionsRepository.getAttractionList();
    }

}



