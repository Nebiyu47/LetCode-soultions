package HackRanck.DataStructure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DuplicateOfTwoArrayList {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,4,5));
        List<Integer>b = new ArrayList<>(Arrays.asList(2,5,6,7));
        System.out.println(duplicatedArrayList(a,b));
    }
    public static List duplicatedArrayList(List<Integer> a, List<Integer> b){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :a){
           if(map.containsKey(i)){
               map.put(i,map.get(i)+1);
           }else {
               map.put(i,1);
           }

        }
        for(int i : b){
            if(map.containsKey(i)){
                if(map.get(i)>0){
                    map.put(i,map.get(i)-1);
                }
            }
        }


        return Arrays.asList(map);
    }
}
