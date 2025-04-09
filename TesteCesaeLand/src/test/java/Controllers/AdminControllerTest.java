package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

class AdminControllerTest {

    private AdminController adminController;
    private AdminController adminControllerControl;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.adminController = new AdminController(
                "src/test/resources/Cesaeland_vendas.csv",
                "src/test/resources/Cesaeland_atracoes.csv"
        );

        this.adminControllerControl = new AdminController(
                "src/test/resources/Cesaeland_vendas_control.csv",
                "src/test/resources/Cesaeland_atracoes_control.csv"
        );
    }

    @Test
    public void getpriceVsTimeTest() {
        assertEquals("Volta ao mundo com 50$, sem desconto para crianças", adminController.getpriceVsTime().getAttraction());
    }
}