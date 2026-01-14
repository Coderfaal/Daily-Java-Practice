package corejava.SimpleExcercises;



// counting how many times iis occuring in a string
public class StringLetterOccurences {

    public static void main(String[] args) {

        String s = "Mississippifalguniiiiibingiiiooo";
        char [] occ = s.toCharArray();
        int count =0;

        for(int i =0;i<occ.length;i++){
            if(occ[i]== 'i'){
                count ++;
            }

        }System.out.println(count);

    }
}
