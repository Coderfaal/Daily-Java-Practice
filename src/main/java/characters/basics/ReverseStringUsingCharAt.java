package characters.basics;

public class ReverseStringUsingCharAt {


    public static void main(String[] args) {

        String s = "falguni";
        String reverse = "";

      //  for(int i  = 0 ; i <s.length()-1 ; i--){

            for(int i = s.length()-1 ; i >=0 ;i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);


    }
}
