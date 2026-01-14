package corejava;

public class CharCount {


    public static void main(String[] args) {
        int count = countCharacters("magazine");
        System.out.println("number of a is :  " + count);
    }

    public static int countCharacters(String inputString){
        int count = 0;

        for(int i = 0;i < inputString.length(); i++){
            char extract = inputString.charAt(i);

            if('a' == extract){
                count ++;
            }
        }

        return count;
    }



    
}
