package characters.basics2;

public class PrintCharAtEvenAndOddIndex {


    public static void main(String[] args) {

        String s = "helloMysugarboo";


        for(int i  = 0 ; i < s.length(); i ++ ){

            //char c = s.charAt(i);

            if (i % 2 == 0){
                System.out.println(s.charAt(i));
//            }else if (i % 2 != 0){
//                System.out.println(s.charAt(i));
            }
        }


    }
}
