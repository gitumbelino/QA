package View;

import Controllers.LoginController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {

    LoginController loginController;

    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    public void entryView() throws FileNotFoundException, InterruptedException {

        Scanner input = new Scanner(System.in);
        int loginOption;

        do {
            System.out.println("\nBem vindo ao CesaeLand");
            System.out.println("1. Área Cliente");
            System.out.println("2. Área Reservada (login)");
            System.out.println("0. Sair \uD83C\uDFC3\uD83D\uDEAA");
            System.out.print("Escolha: ");

            loginOption = input.nextInt();

            switch (loginOption) {
                case 1: // Customer
                    CostumerView customerView = new CostumerView();
                    customerView.clientMenu();
                    break;

                case 2: // Staff Member

                    System.out.println("\n Insira as suas credênciais");

                    System.out.print("Username: ");
                    String usernameInput = input.next();

                    System.out.print("Password: ");
                    String passwordInput = input.next();

                    validateLogin(usernameInput,passwordInput);
                    break;

                case 0: // Exit
                    break;

                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Opção Inválida \uD83D\uDEA8");
            }
        } while (loginOption != 0);
    }


    private void validateLogin(String usernameInput, String passwordInput) throws FileNotFoundException, InterruptedException {

        String access = loginController.accessType(usernameInput, passwordInput);

        switch (access){
            case "ADMIN":
                AdminView adminView = new AdminView();
                adminView.adminMenu();
                break;

            case "ENG":
                EngView engView = new EngView();
                engView.engMenu();
                break;

            case "ERROR":
                System.out.println("\uD83D\uDD12 Acesso Inválido \uD83D\uDD12");
                break;
        }
    }

}
