package corejava;

import java.util.Arrays;

public class AscendingOrderCharacters {


    public static void main(String[] args) {

        String a = "Apple";

        char [] array = a.toCharArray();


        Arrays.sort(array);

        System.out.println(array);

        for (char c: array){
            System.out.println(c);

        }



    }
}
