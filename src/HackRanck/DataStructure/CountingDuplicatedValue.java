package HackRanck.DataStructure;

import java.util.*;

public class CountingDuplicatedValue {
    public static void main(String[] args) {


    List<Integer> al = new ArrayList<>(Arrays.asList(1,2, 3, 4, 5 ,4 ,3, 2, 1, 3, 4));
    HashMap<Integer,Integer> map=  new HashMap<>();
    int max=0;

        for(int i :al){
        if(map.containsKey(i)){
            int count= map.get(i);
            map.put(i,count+1);
        }else {
            map.put(i,1);
        }
    }
  for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue()>1){
            System.out.println(entry.getKey()+" count"+entry.getValue());
            if(entry.getValue()>= entry.getKey()){
                max=entry.getValue();
            }
        }
    }
        System.out.println(max);
}
}
