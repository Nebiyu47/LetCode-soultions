package HackRanck.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SumTwoArray {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(40, 50, 60));
        List<Integer> b = new ArrayList<>(Arrays.asList(40, 50, 60));
        int [] c={40,50,60};
        int [] d= {5,8,12};

        System.out.println(sumArray(c,d,60));
    }

    public static int sumArray(int[] arr1, int[] arr2 , int b) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Arrays cannot be null");
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        int index=0;
        int [] result = new int[6];

        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                map.put(arr2[i], map.get(arr2[i]) + 1);
            } else {
                map.put(arr2[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            sum += key * map.get(key);
            result[index++]=sum;
        }

        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

        return sum;
    }
}

