package GroupTasks;

public class EvenOrOdd {


    public static String identify(int a){

        if(a%2==0){
            return "even";
        }
        else{
            return "odd";
        }

    }

    public static void main(String[] args) {
        System.out.println(identify(4));
    }
}
