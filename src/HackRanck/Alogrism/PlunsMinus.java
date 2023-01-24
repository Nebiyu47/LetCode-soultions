package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlunsMinus {
    public static void main(String[] args) {
        int [] b={1 ,1,0,-1,-1};
        ArrayList<Integer> al = new ArrayList<>();
        for (int c : b){
            al.add(c);
        }
        System.out.println(plusMinus(al));
    }
    public static List<Double> plusMinus(List<Integer> arr){

        double countMinus =0;
        double countPlus=0;
        double countZero=0;
        double fractionMinus=0;
        double fractionPlus=0;
        double fractionZero=0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<1){
                countMinus++;
            }else if(arr.get(i)>1){
                countPlus++;
            }else {
                countZero++;
            }
        }
        if(countMinus!=0||countPlus!=0||countZero!=0){
            fractionMinus=countMinus/arr.size();

            fractionPlus=countPlus/arr.size();
            fractionZero=countZero/arr.size();
        }

        List <Double> b= Arrays.asList(fractionMinus,fractionZero,fractionPlus);

    return b;
    }
}
