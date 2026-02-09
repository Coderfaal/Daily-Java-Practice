package InterviewPracticse;

import java.util.Arrays;

public class Sort2ArraysWithout3VAriable {

    public static void main(String[] args) {
        int[] a = {1, 5, 9, 10, 15, 20};
        int[] b = {2, 3, 8, 13};
        sortTwoArrays(a,b);

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(b));
    }

        public static void sortTwoArrays(int[] a, int[] b) {
        for(int i=a.length-1;i>=0;i--){

            if(a[i]>b[0]){

                int temp= a[i];
                a[i]=b[0];
                b[0]=temp;

                int first= b[0]; int k;

                for(k=1;k<b.length && b[k]<first;k++){

                    b[k-1]=b[k];

                }
                b[k-1]=first;
            }

        }
    }
}
