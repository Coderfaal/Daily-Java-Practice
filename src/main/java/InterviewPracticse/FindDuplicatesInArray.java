package InterviewPracticse;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicatesInArray {

    public static void main(String[] args) {

    int[] array = {1,2,3,3,4,2,5,6,77,4};

        Set<Integer> set= new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : array){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }

        if(duplicates.isEmpty()){
            System.out.println("no duplicates found");
        }else {
            System.out.println("duplicates are"+duplicates);
        }

    }
}
