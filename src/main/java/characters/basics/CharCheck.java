package characters.basics;

public class CharCheck {



//    Scanner sc = new Scanner(System.in);
//    char ch = sc.next().charAt(0);


    public static void main(String[] args) {
        char ch = 'f';

        if(ch >='A'  && ch <= 'Z'){
            System.out.println("it is UpperCase");
        }
        else if(ch >='a' && ch <= 'z'){
            System.out.println("it is LowerCase");
        }                   else if(ch >='0' && ch <= '9'){
            System.out.println("it is Digit");
        }
        else{
            System.out.println("it is special character");
        }
    }

}
