package kingdee.base.ssc.day04;

public class PasswordUtils {
    @UseCase(id = 1,description = "password must containt '@' ")
    public boolean validatePassword(String password){
        return (password.matches("@"));
    }
}
