package big_tasks_from_Saim.Amazon;

public class AmazonAccount {
    /*
    create a class AmazonAccount

 instance variables:
  - userName (String)
  - email (String)
  - hasPrime (boolean)

 constructor:
  - initialize the fields

 encapsulate AmazonAccount

 methods: toString()
     */
    private String userName;
    private String email;
    private boolean hasPrime;

    public AmazonAccount(String userName, String email, boolean hasPrime) {
        this.userName = userName;
        this.email = email;
        this.hasPrime = hasPrime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }

    @Override
    public String toString() {
        return "AmazonAccount{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }
}
