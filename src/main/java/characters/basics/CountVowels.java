package characters.basics;

public class CountVowels {


    public static void main(String[] args) {
        String s = "HiFa@lGood2Cyou";
        int upperCase=0 ,lowerCase =0, digit =0 , specialChar =0;



        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);


            if (c >= 'A' &&  c <='Z'){
               // System.out.println("UPPERCASE");
                upperCase++;
            } else if (c >= 'a' && c <= 'z') {
              //  System.out.println("lowercase");
                lowerCase++;

            } else if (c >= '0' && c <= '9') {
               // System.out.println("Digits");
                digit++;

            }else {
                //System.out.println("SPECIAL character");
                specialChar++;
            }
        }

        System.out.println("total UPPERCASE : "+ upperCase);
        System.out.println("total lowercase : "+ lowerCase);
        System.out.println("total digits :"+ digit);
        System.out.println("total special char :"+specialChar);

}}
