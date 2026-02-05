package InterviewPracticse;

import java.util.Arrays;

public class FindSecondHighestNumber {

    public static void main(String[] args) {


        int[] array= {20,40,45,5,50,95,30,80,45};

        Integer result = secondHighest(array);

        if(result != null){
            System.out.println("second highest number :"+result);
        }else {
            System.out.println("no second higest number found");
        }

    }

    public static Integer secondHighest(int[]array){

        if(array.length< 2 )return null;
        int max = Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;


        for(int num : array){
            if(num > max){
                secondMax=max;
                max=num;
            }else if ( num >secondMax && num!=max)
            {
                secondMax=num;

            }

        }


        return (secondMax ==Integer.MIN_VALUE) ? null :secondMax;
    }
}
