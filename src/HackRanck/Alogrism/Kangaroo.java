package HackRanck.Alogrism;

public class Kangaroo {
    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
    }
    public static String kangaroo(int x1, int v1, int x2 , int v2){
       if(v1<=v2){
           return "NO";
       }

       while(x1<=x2){
           x1=x1+v1;
           x1=x1;
           x2=x2+v2;
           x2=x2;
           if(x1==x2){
               return "yes";
           }
       }
        return "No";
    }
}
