package HackRanck.DataStructure;


public class reverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(154));
    }
    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            int dig= num%10;
            rev=rev*10+dig;
            num/=10;
        }
        return rev;
    }
}
