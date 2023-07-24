
import java.util.*;

public class TimeConversion{
    public String timeConversion(String s){
        String[] parts = s.split(":");
            int hh=Integer.parseInt(parts[0]);
            int mm=Integer.parseInt(parts[1]);
            int ss=Integer.parseInt(parts[2].substring(0,2));
            String period=parts[2].substring(2);
        if(period.equals("AM")){
            
            if(hh==12){
                hh=0;
            
            }
        }
            else{
                if(hh!=12){
                    hh+=12;
                }
            }
            
        
        return String.format("%02d:%02d:%02d",hh,mm,ss);

    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        // System.out.println("Enter the string in the format (hh:mm:yy)");
        String a=s.next();
        TimeConversion t = new TimeConversion();
        String time24hr=t.timeConversion(a);
        System.out.print(time24hr);
    }   
}

