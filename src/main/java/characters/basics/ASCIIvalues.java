package characters.basics;

public class ASCIIvalues {


    public static void main(String[] args) {

        //printing a-z  int -> explicit casting
        for(char c = 'a';c<='z';c++){
            System.out.println(c + "->"+ (int)c);
        }
        System.out.println("_______________________");

        //printing A-Z
        for(char ch= 'A';ch<='Z';ch++){
            System.out.println(ch +"->"+ (int)ch);
        }

        System.out.println("_______________________");


        //implicit casting

        char q = 'B';
        int ascii = q;

        System.out.println(ascii);

        System.out.println("_______________________");

        //Casting (char) i converts the number into its ASCII character
        for(int j = 0 ; j<=127;j++){
            System.out.println(j +"->"+ (char)j);
        }
    }
}
