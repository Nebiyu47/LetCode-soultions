package HackRanck.Alogrism;

import java.util.*;

public class HundleRace {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(1, 6, 3, 5, 2));
        System.out.println(hundleRacee(4, al));
    }

    public static int hundleRacee(int k, List<Integer> height) {
        int minus = 0;
        int max =  Integer.MIN_VALUE;

        for (int i = 0; i < height.size(); i++) {
            minus = height.get(i) - k;

            if (minus>max) {

                max=minus;

            }

        }
        return max;
    }

}
