import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double length = arr.size();
        double posInteger = 0;
        double negInteger = 0;
        double zInteger = 0;
        for(Integer number : arr){

            if(number > 0){
                posInteger++;
                System.out.println(posInteger);
            }else if(number < 0){
                negInteger++;
            }else{
                zInteger++;
            }
        }
        System.out.println(posInteger/length);
        System.out.println(negInteger/length);
        System.out.println(zInteger/length);

    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        Result.plusMinus(arr);

    }
}