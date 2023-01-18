package LetCode;

public class test {
    public static void main(String[] args) {
      int x=1234;
       int m;
       int reverse=0;
       while (x!=0){
           m=x%10;
           reverse=reverse*10+m;

           x=x/10;
       }
        System.out.println(reverse);
    }



}
