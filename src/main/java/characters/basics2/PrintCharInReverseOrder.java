package characters.basics2;

public class PrintCharInReverseOrder {

    public static void main(String[] args) {


        String s = "HEllo";

        String reverse = "";

        for(int  i=s.length()-1; i>= 0; i--){
          char c = s.charAt(i);

           // reverse = reverse + s.charAt(i);
            //System.out.println(reverse);
            System.out.println(c);

        }

    }
}
