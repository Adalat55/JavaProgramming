package office_hours.practice_11_24_2021;

import java.util.SortedSet;

public class Examples {
    public static void main(String[] args) {
        try{
            String s = "java";
            s.charAt(1);
            int [] a = {3,2,5,1,5};
            System.out.println(a[100]);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("String exception caught");
            System.out.println(e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println("parent catches");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
}
