package InterviewPracticse;

import java.util.Arrays;

public class SecondHighestUsingSorting {


    public static void main(String[] args) {

        int [] array = {10,30,50,40,20};

        Arrays.sort(array);

        int max= array[array.length-1];


        for(int i = array.length-2 ; i>=0;i--){
            if(array[i] != max){
                System.out.println("second higest number is : "+ array[i]);
                return;
            }

        }
        System.out.println("no secomd higesst number");
    }
}
