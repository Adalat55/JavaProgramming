package recall_practices.string;

import java.util.Locale;

public class Address {
    /*
    A person will enter their address into a String. Make sure the String is not empty.
    If it is empty print: "No address found".
    If there is an address, make all the text uppercase to match the expected format

        Ex:
            Input: 231332 leaf ave, lake city 3132
            Output: 231332 LEAF AVE, LAKE CITY 3132

        Ex:
            Input: ""
            Output: No address found
     */
    public static void validAddress(String address){

        if(address.isEmpty()){
            System.out.println("No address found");
        }else{
          address = address.toUpperCase();
            System.out.println(address);

        }
    }

    public static void main(String[] args) {
        validAddress("1234 Adress");
    }
}
