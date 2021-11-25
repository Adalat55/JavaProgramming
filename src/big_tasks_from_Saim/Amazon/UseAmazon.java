package big_tasks_from_Saim.Amazon;

public class UseAmazon {
    public static void main(String[] args) {
        AmazonAccount account1= new AmazonAccount("james55","jamesbond@gmail.com", true);

        account1.setUserName("Bond55");

        System.out.println(account1.getUserName());
        System.out.println(account1);


    }
}
