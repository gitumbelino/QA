package Model;

import Domain.Users;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {

    private ArrayList<Users> usersList;

    public UsersRepository(String filePath) throws FileNotFoundException {
        this.usersList = CSVReader.readUserFileToArray(filePath);
    }

    public ArrayList<Users> getUsersList() {
        return usersList;
    }
}
