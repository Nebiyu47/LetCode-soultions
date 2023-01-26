package HackRanck.Alogrism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingRecords {
    public static void main(String[] args) {
    List<Integer> al = new ArrayList<>(Arrays.asList(12,24,10,24));
        System.out.println(breakingRecords(al));
    }
    public static List<Integer> breakingRecords(List<Integer> scores){
        ArrayList<Integer> al= new ArrayList<>();
        int minCount=0;
        int MaxCount=0;
        int max=scores.get(0);
        int min=scores.get(0);
        for(int i=0;i<scores.get(i);i++){
            int val = scores.get(i);
            System.out.println(val);
            if(val<min){
                min=val;
                minCount++;
            }else if(val<max){
                max=val;
                minCount++;
            }
        }
        al.add(minCount);
        al.add(MaxCount);

        return al;
    }

}
