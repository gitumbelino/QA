package Tools;

import Domain.Attractions;
import Domain.Costs;
import Domain.Sales;
import Domain.Users;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class CSVReader {




    public static ArrayList<Users> readUserFileToArray(String filePath) throws FileNotFoundException {



        // Instanciar o Array de Domain.Users (vazio)
        ArrayList<Users> usersArrayRead = new ArrayList<Users>();

        // Instanciar Scanner para ler o ficheiro (caminho passado por parâmetro)
        Scanner sc = new Scanner(new File(filePath));

        // Ignorar a primeira linha (cabeçalho)
        sc.nextLine();

        // Ciclo que vai iterar para cada linha do ficheiro
        while (sc.hasNextLine()) {

            // Guardamos toda a linha na variável: linha
            String line = sc.nextLine();

            // Criamos um Array de Strings, onde cada posição terá uma coluna da linha
            String[] separatedLine = line.split(",");

            // Criar objeto User
            Users newUser = new Users(separatedLine[0],
                    separatedLine[1],
                    separatedLine[2]);

            // Adicionar novo User ao Array
            usersArrayRead.add(newUser);
        }

        return usersArrayRead;
    }



    public static ArrayList<Attractions> readAttractionsFileToArray(String filePath) throws FileNotFoundException {

        ArrayList<Attractions> attractionsArrayRead = new ArrayList<Attractions>();

        Scanner sc = new Scanner(new File(filePath));

        sc.nextLine();

        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            String[] separatedLine = line.split(";");


            Attractions newAttraction = new Attractions(
                    Integer.parseInt(separatedLine[0]),
                    separatedLine[1],
                    Double.parseDouble(separatedLine[2]),
                    Double.parseDouble(separatedLine[3]),
                    Integer.parseInt(separatedLine[4])
            );

            attractionsArrayRead.add(newAttraction);
        }

        return attractionsArrayRead;
    }




    public static ArrayList<Sales> readSalesFileToArray(String filePath) throws FileNotFoundException {

        ArrayList<Sales> salesArrayRead = new ArrayList<Sales>();

        Scanner sc = new Scanner(new File(filePath));

        sc.nextLine();

        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            String[] separatedLine = line.split(";");

            Sales newSale = new Sales(
                    Integer.parseInt(separatedLine[0]),
                    separatedLine[1],
                    separatedLine[2]
            );

            salesArrayRead.add(newSale);

        }

        return salesArrayRead;

    }


    public static ArrayList<Costs> readCostsFileToArray(String filePath) throws FileNotFoundException {


        ArrayList<Costs> costsArrayRead = new ArrayList<>();

        Scanner sc = new Scanner(new File(filePath));

        sc.nextLine();

        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            String[] separatedLine = line.split(";");

            Costs newCost = new Costs(
                    Integer.parseInt(separatedLine[0]),
                    Double.parseDouble(separatedLine[1]),
                    Integer.parseInt(separatedLine[2])
            );

            costsArrayRead.add(newCost);

        }

        return costsArrayRead;
    }
}
