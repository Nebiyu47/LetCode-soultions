package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class designerPdfViewer {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(Arrays.asList(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5));
        String m = "abc";
        System.out.println(designerPdfViewer(al,m));
    }
    public static int designerPdfViewer(List<Integer> h , String word){

      int max=0;
        for(char c : word.toCharArray()){
            int m = h.get(c-'a');
            if(m>max){
                max=m;
            }

        }
         return max*word.length();
    }
}
