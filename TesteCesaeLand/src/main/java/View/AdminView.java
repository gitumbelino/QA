package View;

import Controllers.AdminController;
import Domain.Attractions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {

    AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController(
                "src/main/resources/Cesaeland_vendas",
                "src/main/resources/Cesaeland_atracoes"
        );
    }

    public void adminMenu() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int menuOption;

        do {
            System.out.println("\n Bem vindo Senhor Administrador!");
            System.out.println("1. Consultar o total de todas as vendas.");
            System.out.println("2. Consultar o total de lucro.");
            System.out.println("3. Consultar o total de vendas e lucro por mês, de forma tabelar.");
            System.out.println("4. Consultar a atração mais procurada por adultos (número de bilhetes vendidos).");
            System.out.println("5. Consultar a atração mais procurada por crianças (número de bilhetes vendidos).");
            System.out.println("6. Consultar a atração mais procurada (número de bilhetes vendidos).");
            System.out.println("7. Consultar a atração mais lucrativa (considere o período total).");
            System.out.println("8. Consultar a atração menos lucrativa (considere o período total).");
            System.out.println("9. Consultar a atração com melhor preço/tempo. #####(Função que escolhi deenvolver)######.");
            System.out.println("10. Adicionar novo login");
            System.out.println("0. Sair \uD83C\uDFC3\uD83D\uDEAA");
            System.out.print("Escolha: ");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Opção não desenvolvida, volte mais tarde :D");
                    break;

                case 2:

                    System.out.println("Opção não desenvolvida, volte mais tarde :D");
                    break;

                case 3:

                    System.out.println("Opção não desenvolvida, volte mais tarde :D");
                    break;

                case 4:
                    System.out.println("Opção não desenvolvida, volte mais tarde :D");
                    break;

                case 5:

                    System.out.println("Opção não desenvolvida, volte mais tarde :D");
                    break;

                case 6:

                    System.out.println("Opção não desenvolvida, volte mais tarde :D");
                    break;

                case 7:

                    System.out.println("Opção não desenvolvida, volte mais tarde :D");
                    break;

                case 8:

                    System.out.println("Opção não desenvolvida, volte mais tarde :D");
                    break;

                case 9:
                    Attractions bestCostBenefitAttraction = this.adminController.getpriceVsTime();
                    System.out.println("A atração com melhor relação/preço é: ");
                    System.out.println(bestCostBenefitAttraction.getAttraction());
                    System.out.println((bestCostBenefitAttraction.getDurationSeconds() / bestCostBenefitAttraction.getPriceAdult()) + "s/€");
                    break;

                case 10:
                    System.out.println("Opção não desenvolvida, volte mais tarde. :D");
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\uD83D\uDEA8  Opção inválida \uD83D\uDEA8");
            }
        } while (menuOption != 0);
    }

}
