import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution3 {
    public static String timeConversion(String s) {
        // Write your code here
        String[] split = s.split(":");
        String ending = split[2].substring(2);
        if(ending.equals("PM")){
            if (!split[0].equals("12")){
                int hour  = Integer.parseInt(split[0]);
                int newhour = hour +12;
                return newhour +":"+ split[1] +":"+ split[2].substring(0,2);
            }
            return split[0] +":"+ split[1] +":"+ split[2].substring(0,2);
        }else{
            if (!split[0].equals("12")){
                return split[0] +":"+ split[1] +":"+ split[2].substring(0,2);
            }
            String newHour = "00";
            return newHour +":"+ split[1] +":"+ split[2].substring(0,2);

        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println(timeConversion("12:05:45AM"));
    }

}
