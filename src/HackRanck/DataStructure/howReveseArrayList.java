package HackRanck.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class howReveseArrayList {

    public static void main(String[] args) {
    ArrayList<Integer>ml = new ArrayList<>(Arrays.asList(20,21,22,23));
        System.out.println(revsre(ml));
    }
    public static List<Integer> revsre(List<Integer> al){

        ArrayList<Integer>ml = new ArrayList<>();

        for(int i : al){
            int rev=0;
            while(i!=0){

                int digt = i%10;
                rev=rev*10+digt;
                i/=10;
            }
            ml.add(rev);
        }
    return ml;
    }
}
