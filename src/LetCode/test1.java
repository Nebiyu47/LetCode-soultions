package LetCode;

public class test1 {

    public static void main(String[] args) {
       String s = "07:05:12PM";
      String [] sm = s.split(":");

      Integer hours= Integer.parseInt(sm[0]);
      String min= sm[1];
      String second= sm[2].substring(0,sm.length-1);
      String period = sm[2].substring(sm.length-1,sm.length+1);

      String newString = "";
      if((0<=hours && hours < 12) && (period.equalsIgnoreCase("AM"))){
         newString =   String.format("%2d",hours)+ ":"+ min+":"+second+period;
      }else if((0<=hours&&hours<12)&&(period.equalsIgnoreCase("PM"))){
          newString =String.format("%2dh",hours+12)+":"+min+":"+second+period;
        }else if((hours==12)&&(period.equalsIgnoreCase("Am"))){
            newString=String.format("%2dh",00)+":"+min+":"+second+period;
        }else if((hours==12)&&(period.equalsIgnoreCase("PM"))){
          newString =String.format("%2dh",hours)+ ":"+min+":"+second+period;
      }

        System.out.println(newString);

    }

}
