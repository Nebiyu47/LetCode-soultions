package HackRanck.Alogrism;

public class pageCount {
    public static void main(String[] args) {
        System.out.println(pageCount(5,3));


    }
    public static int pageCount(int n , int p){
      int pageTurnStart = p/2;
      int pageTurnFromEnd = n/2-pageTurnStart;
      return Math.min(pageTurnStart,pageTurnFromEnd);
    }
}
