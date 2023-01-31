package HackRanck.Alogrism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CatsAndWomen {
    public static void main(String[] args) {

        System.out.println(catAndMouse(1, 3 ,2));

    }

    public static String catAndMouse(int x, int y, int z) {

int  distanceCatA= Math.abs(x-z);
int distanceCatB=Math.abs(y-z);

  if(distanceCatA<distanceCatB){
      System.out.println("Cat A");
  }else if(distanceCatA>distanceCatB){
      System.out.println("Cat B");
  }else {
      System.out.println("Mouse c");
  }
  return  " ";
  }
}
