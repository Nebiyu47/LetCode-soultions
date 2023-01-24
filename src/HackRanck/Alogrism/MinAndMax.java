package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) {
      int[] a={1,2,3,4,5 };
        ArrayList<Integer> al = new ArrayList<>();
        for (int l: a ){
            al.add(l);
        }
        System.out.println(minAndMax(al));
    }
    public static int minAndMax(List<Integer> arr){
        int Min = 0;
        int Max = Integer.MIN_VALUE;
        ArrayList al =new ArrayList<>();
        int sum=0;
        int sum2=0;
        for(int i=0;i<arr.size();i++) {

            sum += arr.get(i);
            al.add(sum);
           }

          for(int i=0;i<arr.size();i++){

                  sum2=sum-arr.get(i);

              System.out.println(sum2);
                  if(Min<sum2){
                      Min=sum2;
                  }else {
                      Max=sum2;
                  }
          }


       System.out.println(Max+ " "+Min);
        return sum;
    }
}
