package corejava.SimpleExcercises;

import java.util.Scanner;

//q- accept 10 or 5 user inputs sort the elements and and printing maximum
//in ascending order and not using arrays and collections
//pointer method
public class Maximum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c =s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();

//        for(int i=0;i<5;i++){
//            int t;
//            if(a>b){t=a;a=b;b=t;}
//            if(b>c){ t =b; b=c; c=t;}
//            if(c>d){t=c; c=d; d=t;}
//            if (d>e){t=d; d=e ;e=t;}
//        }
        int t=a;
        for(int z =0;z<5;z++){

            if(t<b){t=b;}
            if(t<c){t=c;}
            if(t<d){t=d;}
            if(t<e){t=e;}
        }
        System.out.println(e);
        System.out.println(t);
}}
