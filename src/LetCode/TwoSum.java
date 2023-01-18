package LetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arry = {2, 7, 5, 4};
        int target = 9;
        System.out.println(twoSum(arry, target));
    }

    public static int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> map= new HashMap<>();

       for(int i=0;i<nums.length;i++){
        map.put(nums[i],i);
       }
       for(int i=0; i<nums.length;i++){
           int difference = target-nums[i];

            if(map.containsKey(difference)){
                return new int[] {map.get(difference),i};

            }
       }
       return nums;
    }
}

