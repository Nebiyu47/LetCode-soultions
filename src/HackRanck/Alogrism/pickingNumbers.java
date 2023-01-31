package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pickingNumbers {
    public static void main(String[] args) {
     List<Integer> al = new ArrayList<>(Arrays.asList(1,1,2,2,4,4,5,5,5));
        System.out.println(pickingNumbers(al));
    }
    public static int pickingNumbers(List<Integer> a){
        ArrayList<Integer> al = new ArrayList<>();


        for(int i=0;i<a.size();i++){
            int minus=0;
            for(int j=i+1;j<a.size();j++){
                minus=Math.abs(a.get(i)-a.get(j));

                if(minus==1||minus==0){
                    al.add(a.get(i));
                }
            }
        }
        for(int i : al){
            System.out.println(i);
        }
            return al.size();
    }
}
