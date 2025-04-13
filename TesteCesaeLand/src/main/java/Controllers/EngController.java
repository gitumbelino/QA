package Controllers;

import Model.AttractionsRepository;
import Model.SalesRepository;

import java.io.FileNotFoundException;


public class EngController {

    private SalesRepository salesRepository;
    private AttractionsRepository attractionsRepository;

    public EngController(String filePathSales, String filePathAttractions) throws FileNotFoundException {
        this.salesRepository = new SalesRepository(filePathSales);
        this.attractionsRepository = new AttractionsRepository(filePathAttractions);
    }


    //• Consultar Próximas Revisões: Consulta as 3 próximas revisões a serem efetuadas e o número de bilhetes que
    //faltam vender para a revisão ter de ser efetuada. Deve identificar o ID da Atração, Nome de Atração e Número
    //de Bilhetes que Faltam.
    public int nextMaintenace() {
        int nextMaintenace = 0;
        return nextMaintenace;
    }


    //• Consultar Histórico de Revisões: Consulta as 3 últimas revisões que foram efetuadas. Deve identificar o ID da
    //Atração, Nome de Atração e Número de Bilhetes vendidos depois da última revisão.
    public int showMaintenanceHistory() {
     int maintenanceHistory = 0;
     return maintenanceHistory;
    }

}
