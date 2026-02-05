package InterviewPracticse;

public class OptimizedFirstNonRepeatingChar {

    public static void main(String[] args) {


        String s = "aabbcddeefggh";


        int [] frequency = new int  [256];

        for (char c : s.toCharArray()){
            frequency[c]++;
        }

        for (char c :s.toCharArray()){
            if(frequency[c] ==1){
                System.out.println("first non repeating char is : "+ c);
                return;
            }
        }
        System.out.println("no non repeating ");
    }
}
