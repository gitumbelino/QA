package Controllers;

import Domain.Attractions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerControllerTest {

    private CustomerController customerController;
    private CustomerController customerControllerControl;


    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.customerController = new CustomerController(
                "src/test/resources/Cesaeland_atracoes.csv"
        );

        this.customerControllerControl = new CustomerController(
                "src/test/resources/Cesaeland_atracoes_control.csv"
        );
    }



    @Test
    void getAttractionList() {

        ArrayList<Attractions> attractions = customerController.getAttractionsList();
        Attractions firstAttraction = attractions.get(3);

        assertEquals(4, firstAttraction.getId());
        assertEquals("Rafting Laravel", firstAttraction.getAttraction());
        assertEquals(5, firstAttraction.getPriceAdult());
        assertEquals(4, firstAttraction.getPriceChildren());
        assertEquals(90, firstAttraction.getDurationSeconds());
    }


    @Test
    void arraySizeTest() {
        ArrayList<Attractions> attractions = customerController.getAttractionsList();
        assertEquals(11, attractions.size());
    }

}