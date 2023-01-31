package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AngerProfessor {
    public static void main(String[] args) {
List<Integer> s = new ArrayList<>(Arrays.asList(-1,-3,4,2));
        System.out.println(angerpROFESSOR(3,s));
    }

    public static String angerpROFESSOR(int k , List<Integer> a){

        String s = "";
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<k;i++){
            if(a.get(i)<=0){
               al.add(i);
            }
        }

        if(al.size()==k){

            s="YES";
        }else {
            s="NO";
        }


        return s;
    }
}
