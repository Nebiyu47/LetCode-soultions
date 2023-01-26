package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class birthDay {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1 ,1 ,1 ,1 ,1 ,1));
        int d = 3;
        int m = 2;
        System.out.println(birthday(al, d, m));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i <=s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                System.out.println(j);
                sum += s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }
}
