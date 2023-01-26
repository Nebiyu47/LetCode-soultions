package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
  List<Integer> al= new ArrayList<>(Arrays.asList(1,3,2,6,1,2));
        System.out.println(divisibleSumPairs(3,al));
    }
    public static int divisibleSumPairs( int k, List<Integer> arr){

int count=0;
        for(int i=0;i<arr.size();i++){
            int sum=0;
            for(int j=i;j<arr.size();j++){
                sum=arr.get(i)+arr.get(j);

                if(sum%k==0){
                 count++;

                }

            }
        }
        return count;
    }
}
