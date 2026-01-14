package characters.basics;

public class NoLib {


    public static void main(String[] args) {

        char c = 'F';


        if(c >= 'A' && c<= 'Z'){
            System.out.println("Upperase");
            c= (char)(c+32);
            System.out.println("to Lowercase -> : " + c);
        } else if (c>= 'a' && c <= 'z') {
            System.out.println("lowercase");
            c=(char)(c-32);
            System.out.println("to UpperCase ->  : " + c);

        } else if (c >= '0' && c <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special character");
        }


    }
}
