package Controllers;

import Domain.Attractions;
import Model.AttractionsRepository;
import Model.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {

    private AttractionsRepository attractionsRepository;
    private SalesRepository salesRepository;

    public AdminController(String filePathSales, String filePathAttractions) throws FileNotFoundException {
        this.salesRepository = new SalesRepository(filePathSales);
        this.attractionsRepository = new AttractionsRepository(filePathAttractions);

    }

//    O menu de Administrador deve ser acedido com login, validado com as contas permitidas guardadas num ficheiro. E deve
//    conter as seguintes funcionalidades:


    //1 Consultar o total de todas as vendas.
    public double totalSales() {
        double totalSales = 0;
        return totalSales;

    }

    //2 Consultar o total de lucro.
    public double getTotalProfit() {
        double totalProfit = 0;
        return totalProfit;
    }


    //3 Consultar o total de vendas e lucro por mês, de forma tabelar.
    public double totalSalesPlusEarnsTablePerMonth() {
        double totalSalesMonth = 0;
        return totalSalesMonth;
    }


    //4 Consultar a atração mais procurada por adultos (número de bilhetes vendidos).
    public int mostWantedByAdults() {
        int mostWantedByAdults = 0;
        return mostWantedByAdults;

    }


    //5 Consultar a atração mais procurada por crianças (número de bilhetes vendidos).
    public int mostWantedByChildren() {
        int mostWantedByChildren = 0;
        return mostWantedByChildren;
    }


    // 6 Consultar a atração mais procurada (número de bilhetes vendidos).

    public int mostWantedAll() {
        int mostWantedAll = 0;
        return mostWantedAll;
    }


    //7 Consultar a atração mais lucrativa (considere o período total).
    public double mostLucrative() {
        double mostLucrative = 0;
        return mostLucrative;
    }


    //8 Consultar a atração menos lucrativa (considere o período total).
    public double leastLucrative() {
        double leastLucrative = 0;
        return leastLucrative;
    }


    //*****Opção escolhida*******
    // 9 Consultar a atração com melhor preço/tempo. Apresenta a atração que custa menos por segundo.


    public Attractions getpriceVsTime() {


        ArrayList<Attractions> attractionsList = attractionsRepository.getAttractionList();
        if (attractionsList.isEmpty()) {
            return null;
        }

        Attractions bestAttraction = attractionsList.get(0);
        double bestRelation = bestAttraction.getPriceAdult() / bestAttraction.getDurationSeconds();


        for (Attractions attraction : attractionsList) {

            double currentRelation = attraction.getPriceAdult() / attraction.getDurationSeconds();

            if (currentRelation < bestRelation) {
                bestRelation = currentRelation;
                bestAttraction = attraction;
            }
        }

        return bestAttraction;
    }


    //10 Adicionar novo login: Permite adicionar um novo acesso válido, perguntando o tipo de acesso a criar.
    // Deve validar se o nome do utilizador não é duplicado
    public void addLogin() {
    }


}
