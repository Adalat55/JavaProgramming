package ExtraPractices;

public class AddNumbers {
    public static void main(String[] args) {

        int total=0;
        for(int i = 0; i<=100;i++){

           if(i%2==0) {
               total += i;
           }

        }
        System.out.println(total);
    }
}
