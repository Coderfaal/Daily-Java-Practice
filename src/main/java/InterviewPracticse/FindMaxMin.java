package InterviewPracticse;

public class FindMaxMin {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 9, 2, 8, 5, 0, 4};


        int max= arr[0];
        int min= arr[0];

        for(int i =1;i<arr.length; i++){
            max=Math.max(max,arr[i]);
            min= Math.min(min,arr[i]);

        }
        System.out.println(max);
        System.out.println(min);
    }
}
