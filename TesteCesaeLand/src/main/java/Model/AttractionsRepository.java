package Model;

import Domain.Attractions;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AttractionsRepository {

    ArrayList<Attractions> attractionList;

    public AttractionsRepository(String filePath) throws FileNotFoundException {
        this.attractionList = CSVReader.readAttractionsFileToArray(filePath);
    }

    public ArrayList<Attractions> getAttractionList() {
        return attractionList;
    }
}
