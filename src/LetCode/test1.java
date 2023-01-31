package LetCode;

import java.util.*;

public class test1 {

    public static void main(String[] args) {

        int[] a = {5, 1, 1};
        int[] b = {4};
        int d=60;
        int max=Integer.MIN_VALUE;
        int[] result =new int[a.length];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                sum = a[i] + b[j];
             //   System.out.println(sum);
                if(sum<=d){
                    result[i]=sum;
                  //  System.out.println(result[i]);
                }
            }

        }
        for(int i=0;i< result.length;i++){
            if(max<result[i]){
                max=result[i];
             //   System.out.println(max);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int c : a){
            al.add(c);
        }
        for (int c : b){
            al.add(c);
        }
        for(int i : al){
            if(max<al.get(i)){
                max=al.get(i);
            }
        }
        System.out.println(max);
    }
}
