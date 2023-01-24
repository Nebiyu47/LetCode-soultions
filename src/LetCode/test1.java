package LetCode;

public class test1 {

    public static void main(String[] args) {

        int[] a = {73, 67, 38, 33};
        int[] n = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            double m = a[i]%5;
           // System.out.println(m);
            if (m!= 0) {
                a[i]++;
              // System.out.println(a[i]);
            } else {
                n[i] = a[i];
                System.out.println(n[i]);
            }
        }
        for (int i=0;i<n.length;i++){
       //   System.out.println(n[i]);
        }
    }
}
