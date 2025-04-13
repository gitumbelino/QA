package View;

import Controllers.EngController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class EngView {

    EngController engController;

    public EngView() throws FileNotFoundException {
        this.engController = new EngController(
                "src/main/resources/Cesaeland_vendas",
                "src/main/resources/Cesaeland_atracoes"
        );
    }

    public void engMenu() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int menuOption;

        do {

            System.out.println("\n Bem vindo Senhor Engenheiro!");
            System.out.println("1. Consultar próximas revisões.");
            System.out.println("2. Consultar Histórico de Revisões.");
            System.out.println("0. Exit \uD83C\uDFC3\uD83D\uDEAA");
            System.out.print("Escolha: ");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Exercicio Incompleto");
                    break;

                case 2:
                    System.out.println("Exercicio Incompleto");
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\uD83D\uDEA8 Invalid Option \uD83D\uDEA8");
            }
        } while (menuOption != 0);
    }
}
