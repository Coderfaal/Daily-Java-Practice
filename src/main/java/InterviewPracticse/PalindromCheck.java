package InterviewPracticse;

public class PalindromCheck {


    public static void main(String[] args) {

        String s= "noon";

        String result = new StringBuilder(s).reverse().toString();
        //System.out.println(result);

        if(s.equals(result)){
            System.out.println("paindrom");
        }else {
            System.out.println("not a palndriom");
        }
    }
}
