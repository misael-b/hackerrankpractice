import java.util.*;

public class SherlockAndArray {
    public static String balancedSums(List<Integer> arr) {
        if(arr.size() == 1){
            return "YES";
        }

        if(arr.isEmpty()){
            return "NO";
        }

        if(arr.size() == 3 && Objects.equals(arr.get(0), arr.get(2))){
            return "YES";
        }
        int sumLeft = 0;
        int sumRight = 0;
        int totalSum = 0;

        for(int num : arr){
            totalSum += num;
        }
        for(int num : arr){
            sumRight = totalSum - sumLeft - num;

            if(sumRight == sumLeft){
                return "YES";
            }
            sumLeft += num;

        }
        return "NO";
    }

    public static String balancedSumsUnoptimized(List<Integer> arr) {

        // Write your code here
        if(arr.size() == 1){
            return "YES";
        }

        if(arr.isEmpty()){
            return "NO";
        }

        if(arr.size() == 3 && Objects.equals(arr.get(0), arr.get(2))){
            return "YES";
        }

        for(int i = 0; i<arr.size() -1; i++){
            int sumLeft = 0;
            int sumRight = 0;
            for(int j = 0; j<i; j++){
                sumLeft += arr.get(j);
            }
            for(int k=i+1; k<arr.size(); k++){
                sumRight += arr.get(k);
            }
            if(sumRight == sumLeft){
                return "YES";
            }
        }
        return "NO";

    }




}
