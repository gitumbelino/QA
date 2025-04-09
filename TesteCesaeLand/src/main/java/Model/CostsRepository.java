package Model;

import Domain.Costs;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CostsRepository {

    private ArrayList<Costs> costsList;

    public CostsRepository() throws FileNotFoundException {
        this.costsList = CSVReader.readCostsFileToArray("src/main/resources/Cesaeland_custos.csv");
    }

    public ArrayList<Costs> getUsersList() {
        return costsList;
    }
}