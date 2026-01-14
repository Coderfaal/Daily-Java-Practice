package Collections;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicates {

    public static void main(String[] args) {



        int [] array = {1,1,2,2,3,3,3,3,4,5,6,7,8,1,6,4,3,2,9};


        Set<Integer> duplicates = new HashSet<>();

        for(int i : array){

            if(!duplicates.add(i)){
                System.out.println("duplicates : "+ i);
            }
        }
        System.out.println(duplicates);
    }
}
