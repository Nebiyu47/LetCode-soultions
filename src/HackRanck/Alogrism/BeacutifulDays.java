package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Collections;

public class BeacutifulDays {
    public static void main(String[] args) {
        beautifulDyas(20,23,6);
    }
    public static int beautifulDyas(int i, int j, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ml = new ArrayList<>();
        ArrayList<Integer>kl = new ArrayList<>();
        for (int n = i; n <= j; n++) {
            al.add(n);
        }
        for( int p : al){
            int rev = 0;
            while ( p!= 0) {

                int digit = p% 10;
                rev = rev * 10 + digit;
                p=p/ 10;

            }

            ml.add(rev);

        }
        int count=0;
        double minus=0;
        int check=0;
       for(int l=0;l<ml.size();l++) {
        minus=Math.abs(al.get(l)-ml.get(l));
        double f=minus/6;
        check=Math.abs(al.get(l)-ml.get(l))/6;
         if(f-check==0){
             kl.add(check);
             count++;

         }

       }


        return kl.size();
    }
}
