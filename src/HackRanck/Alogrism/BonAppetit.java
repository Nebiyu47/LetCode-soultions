package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppetit {
    public static void main(String[] args) {
        List<Integer>al = new ArrayList<>(Arrays.asList(3,10,2,9));
        int b=1;
        int k=7;
        System.out.println(bonAppetit(al,b,k));
    }
    public static String bonAppetit(List<Integer>bill, int b, int k){

      ArrayList<Integer> al= new ArrayList<>();
        int devde=0;
        int sum=0;
        for(int i =0;i<bill.size();i++){

            if(bill.get(i)!=bill.get(b)){

                sum+=bill.get(i);

            }
        }
        System.out.println(sum);
        devde=sum/2;
        if(devde>k) {
            System.out.println(k - devde);
        }else {
            System.out.println(devde);
        }
        return "";
    }

}
