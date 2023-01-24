package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.List;

public class gradingStudents {
    public static void main(String[] args) {
        int[] b = {73, 67, 38, 33};
        ArrayList<Integer> c = new ArrayList<>();
        for (int d : b) {
            c.add(d);
        }
        System.out.println(gradingStudents(c));
    }

    public static List<Integer> gradingStudents(List<Integer> arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 38) {
                arrayList.add(arr.get(i));
            } else {
                int o = arr.get(i);
                int r = o/ 5;
                int c = r + 1;
                int d = c * 5;
                int g = d - o;
                if (g < 3) {
                    arrayList.add(d);
                } else {
                    arrayList.add(o);
                }

            }

        }
        return arrayList;
    }
}

