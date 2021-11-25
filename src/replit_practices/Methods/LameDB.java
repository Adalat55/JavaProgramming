package replit_practices.Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class LameDB {

    public static String lameDb(String db, String op, String id, String data) {

        /*
        m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")   //words = {"1etsy", "2wooden", "3spoon"}

returns:  1etsy#2wooden#3spoon#4aaa
         */

        String [] arr = db.split("#");
        String finalResult="";

        ArrayList<String> words = new ArrayList<>(Arrays.asList(arr));

        int idIndex=Integer.parseInt(id);

        if(op.equals("add")){
           data=idIndex+data;
            words.add(idIndex-1, data);
        }
        if(op.equals("edit")){
            String temp="";
           temp= words.get(idIndex-1).substring(0,1)+data;

           words.set(idIndex-1, temp);
        }
        if(op.equals("delete")){

            words.remove(idIndex-1);

        }
        int num=1;
        for(String each: words){
           finalResult+="#"+num++ +each.substring(1);
        }

        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println(lameDb("1tst#2bla#3foo","delete","1",""));
    }
}
