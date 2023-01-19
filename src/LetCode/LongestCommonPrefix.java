package LetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"abc", "cd","ef"};
      longestCommonprefix(strs);
    }

    public static String longestCommonprefix(String[] strs) {
        String longestCommonprefix= "";
        if(strs.length==0 || strs.length==1){
            return longestCommonprefix;
        }
        int index=0;

        for(char c : strs[0].toCharArray()){
            System.out.println(c);
        }
        return longestCommonprefix;
    }
}