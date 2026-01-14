public class CountVowels {


    public static void main(String[] args) {
        String s  = "bingooooo";
        char [] v = s.toCharArray();
        int count = 0;

        for (int i= 0; i<v.length;i++){
            if(v[i]=='a'|| v[i]=='e' ||v[i]=='i'|| v[i]=='o'|| v[i]== 'u'){
                count ++;
            }
        }
        System.out.println(count);
    }
}
