package GroupTasks;

public class SwapNumbers {
    /*
    Numbers -- Swap Numbers
Swap two variable' values without using a third variable
     */

    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        a=a+b;  //8
        b=a-b;  //8-5=3  b=3
        a=a-b;  //8-3= 5
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
