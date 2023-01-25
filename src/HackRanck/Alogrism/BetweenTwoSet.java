package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BetweenTwoSet {
    public static void main(String[] args) {
      int [] a={2,3};
      int [] b={2,4};
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> e = new ArrayList<>();
        for(int d : a){
            c.add(d);
        }
        for (int f : b){
            e.add(f);
        }

        System.out.println(getTotal(c,e));
    }
    public static int getTotal(List<Integer> a , List<Integer>b){
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> bl = new ArrayList<>();

        for(int x=1;x<=100;x++) {

            for (int i = 0; i < a.size(); i++) {
                int g = a.get(i)*x;
                    al.add(g);
              // System.out.println(al);
                }

        }
       for(int x=1;x<=100;x++){
           for(int i=0;i<b.size();i++){
               if(b.get(i)%x==0){
                   bl.add(x);
                  // System.out.println(bl);
               }
           }
       }
        HashMap<Integer,Integer> map = new HashMap<>();
       for(Integer i : al){
           if(map.containsKey(i)){
               map.put(i,map.get(i)+1);
               }else {
               map.put(i,1);
           }
       }
       int duplicated=0;
       for(Integer i : bl){
           if(map.containsKey(i)){
               if(map.get(i)>0){
                   map.put(i,map.get(i)-1);
                   duplicated++;
               }
           }
       }
           return duplicated;
    }
}
