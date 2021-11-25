package recall_practices.string;

public class UsernameAndPassword {

    /*
    [Username and Password]

Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
         If it is less print: "Password cannot be less than 5 characters"
         If it is more than or equal to 5 print: "Valid password"

    - Also, the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
             Also change the password to have the value: "password"
     */

    public static void userNameAndPassword(String username, String password){

        if(password.length()<5){
            System.out.println("Password cannot be less than 5 characters");
        }else{

            if(password.contains(username)){
                System.out.println("Invalid password, username should not be in it");
                password="password";
                System.out.println("your default password is : "+password);
            }else{
                System.out.println("valid password");
            }

        }
    }

    public static void main(String[] args) {
        userNameAndPassword("Redir", "12355Redir");
    }


}
