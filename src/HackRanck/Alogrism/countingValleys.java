package HackRanck.Alogrism;




import java.util.HashMap;
import java.util.Map;


public class countingValleys {
    public static void main(String[] args) {
        String m = "DUUDUDD";
        int n = 6;
        System.out.println(countingValleys(n, m));
    }

    public static int countingValleys(int n, String path) {
        int countvallees=0;
        char[] m = new char[n];
        for (int i = 0; i < n; i++) {
            m[i] = path.charAt(i);
        }

        HashMap<Character, Integer> map = new HashMap<>();


        for (char i : m) {
            if (map.containsKey(i)) {
                int count = map.get(i);
                map.put(i, count + 1);
            } else {
                map.put(i, 1);
            }
        }
        int g=0;
        int d=0;
        int c=0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

          //  System.out.println(entry.getKey()+ " "+ entry.getValue());

            if(entry.getKey()=='D'){
                 g = entry.getValue();

            }else {
                d =entry.getValue();

            }
            c=d-g;
            System.out.println(c);

            if(c==0){
                countvallees=1;
            }else {
                countvallees=0;
            }
        }
        System.out.println(c);

        return countvallees;
    }
}