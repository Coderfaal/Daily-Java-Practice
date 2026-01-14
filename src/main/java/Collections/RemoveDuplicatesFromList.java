package Collections;

import java.util.*;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,9,2,3,4,4,2);


        Set<Integer> duplicateList = new TreeSet<>(list);
        //List<Integer> list1 = new ArrayList<>(duplicateList);


        System.out.println(duplicateList);
       // System.out.println(list1);

        System.out.println("_______");
        List <String> names = Arrays.asList("harry","draco","malfory","potter","draco","ron","alex","malfory");

        Set<String> removedDuplicates = new TreeSet<>(names);

        System.out.println(removedDuplicates);



    }
}
