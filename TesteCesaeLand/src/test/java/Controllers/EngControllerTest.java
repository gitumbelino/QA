package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
class EngControllerTest {

    private EngController engController;
    private EngController engControllerControl;

    @BeforeEach
    void setUp() throws FileNotFoundException {

        this.engController = new EngController(

                "src/test/resources/Cesaeland_vendas.csv",
                "src/test/resources/Cesaeland_atracoes.csv"

        );

        this.engControllerControl = new EngController(
                "src/test/resources/Cesaeland_vendas_control.csv",
                "src/test/resources/Cesaeland_atracoes_control.csv"
        );
    }


    @Test
    void nextMaintenacetTest() {
        assertEquals(0, engController.nextMaintenace());
    }

    @Test
    void showMaintenanceHistoryTest() {
        assertEquals(0, engController.showMaintenanceHistory());
    }
}