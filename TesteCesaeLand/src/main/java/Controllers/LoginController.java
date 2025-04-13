package Controllers;

import Domain.Users;
import Model.UsersRepository;

import java.io.FileNotFoundException;

public class LoginController {


    private UsersRepository usersRepository;

    public LoginController(String filePathLogins) throws FileNotFoundException {
        usersRepository = new UsersRepository(filePathLogins);
    }

    public String accessType(String usernameInput, String passwordInput) {
        String accessType="ERROR";

        for(Users currentUser: this.usersRepository.getUsersList()){
            if(usernameInput.equals(currentUser.getUserName()) && passwordInput.equals(currentUser.getPassword())){

                accessType= currentUser.getLoginType();
            }
        }

        return accessType;
    }




}