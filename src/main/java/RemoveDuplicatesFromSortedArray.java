import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

     // int fallu = removeDuplicatesPavan();
        //System.out.println(fallu);
        names();

    }
    
    
    /*public static int removeDuplicates(){
        Object[] nums = {1,1,2};
        Set<Integer> falSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            falSet.add((Integer) nums[i]);

        }
        //nums = new int[falSet.size()];
        nums = null;
        System.out.println("hello falguni");
        System.out.println(falSet);
        nums=falSet.toArray();
        System.out.println("nums is "+ Arrays.toString(nums));
        //falSet.toArray(new fal[falSet.size()]);

        return falSet.size();

    }*/


    public static int removeDuplicatesPavan(){
        int[] nums = {1,1,2};
        int[] numsResp = new int[nums.length];
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!= nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        System.out.println("nums is "+ Arrays.toString(nums));
        System.out.println("numResp is "+ Arrays.toString(numsResp));
        return j+1;

    }


    public static void names(){
        int[] anything1 = null;
        int[] anything2 = new int[8];
        int[] anything = {2,23,43,69};

        System.out.println("numbers are "+ Arrays.toString(anything));

    }
}
