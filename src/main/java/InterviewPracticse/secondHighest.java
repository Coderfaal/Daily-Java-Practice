package InterviewPracticse;

public class secondHighest {

    public static void main(String[] args) {



        int[] arr = {3, 5, 1, 9, 2, 8, 5, 0, 4};

        Integer result = secondLargest(arr);

        if(result!=null){
            System.out.println("2nd highest is :"+result);
        }else {
            System.out.println("no 2nd highest");
        }

    }

    public static Integer secondLargest(int[] arr){

        if(arr.length<2)return null;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;



        for(int num :arr){
            if(num>max){
                secondMax= max;
                max= num;
            }else if(num > secondMax && num!=max){
                secondMax= num;
            }
        }

        return (secondMax==Integer.MIN_VALUE) ?null :secondMax;
    }
}
