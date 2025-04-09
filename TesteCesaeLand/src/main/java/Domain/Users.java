package Domain;

public class Users {


    private String loginType;
    private String userName;
    private String password;

    public Users(String loginType, String userName, String password) {
        this.loginType = loginType;
        this.userName = userName;
        this.password = password;
    }

    public String getLoginType() {
        return loginType;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {return password; }

}
