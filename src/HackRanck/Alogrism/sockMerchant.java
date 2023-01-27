package HackRanck.Alogrism;

import java.util.*;

public class sockMerchant {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(1 ,2, 1, 2, 1, 3, 2));
        System.out.println(sockMerchant(al));

    }
    public static int sockMerchant( List<Integer> ar){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count1=0;
        for(int i : ar){
            if(map.containsKey(i)){
                int count=map.get(i);
                map.put(i, count+1);
            }else {
                map.put(i,1);
            }
        }
        int f=0;
        int g=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                if (entry.getValue() % 2 == 0) {
                    f = entry.getValue() - 2;
                } else {
                    int d = 0;

                    d = entry.getValue() - 1;

                    g = d /2;


                }

            }
        }

        return count1=f+g;
    }
}
