package HackRanck.Alogrism;

public class timeConverstion {
    public static void main(String[] args) {
        String s1 ="07:05:45";
        System.out.println(timeConversion(s1));
    }
    public static String timeConversion(String s) {


            // Write your code here
            String[] str = s.split(":");
            Integer hours = Integer.parseInt(str[0]);
            String min = str[1];
            String second = str[2].substring(0, str.length - 1);
            String period = str[2].substring(str.length - 1, str.length + 1);
            String newStrings = "";

            for (int i = 0; i < str.length; i++) {
                if ((0 <= hours && hours < 12) && period.equalsIgnoreCase("AM")) {
                    newStrings = String.format("%2d", hours) + ":" + min + ":" + second + period;
                } else if ((0 <= hours && hours < 12) && period.equalsIgnoreCase("PM")) {
                    newStrings = hours + 12 + ":" + min + ":" + second;
                } else if ((hours == 12) && period.equalsIgnoreCase("AM")) {
                    newStrings = 00 + ":" + min + ":" + second + period;
                } else if ((hours == 12) && period.equalsIgnoreCase("PM")) {
                    newStrings = hours + ":" + min + ":" + second;
                }
            }
            return newStrings;
        }

}
