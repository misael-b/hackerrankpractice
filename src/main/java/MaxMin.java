import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int minValue = arr.get(arr.size()-1);
        for(int i = 0; i<arr.size() -(k-1); i++){
            int max = arr.get(i+(k-1));
            int min = arr.get(i);
            if(max - min<minValue){
                minValue = max - min;
            }

        }
        System.out.println(minValue);
        return minValue;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(7);
        arr.add(2);
        maxMin(2, arr);
    }
}
