package LetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int reverseNum = 0;
        int orginalNum=x;
        int reminder;
        if (x <= 0) {
            return false;
        }
        if (x % 10 == 0) {
            return false;
        }

        while (x != 0) {
            reminder = x % 10;
            reverseNum = reverseNum * 10 + reminder;

            x = x / 10;
        }


        if (orginalNum==reverseNum) {
            System.out.println(reverseNum);

            return true;
        } else {
            return false;
        }
    }
}
