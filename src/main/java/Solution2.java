
import java.util.*;


class Solution2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int max = arr.get(0);
        int min = max;
        long sum = 0;
        for(int i : arr){
            sum+= i;
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println(sum - min);
        System.out.println(sum - max);

    }

    public static void main(String[] args)  {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);

        Solution2.miniMaxSum(arr);
    }
}
