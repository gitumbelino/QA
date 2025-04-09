package Model;

import Domain.Sales;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {

    private ArrayList<Sales> salesList;

    public SalesRepository(String filePath) throws FileNotFoundException {
        this.salesList = CSVReader.readSalesFileToArray(filePath);
    }

    public ArrayList<Sales> getUsersList() {
        return salesList;
    }

}
