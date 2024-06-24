import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> freqArray = new ArrayList<>();
        for(int i = 0; i<100; i++){
            freqArray.add(0);
        }
        for(int i = 0; i<arr.size();i++){

            int oldValue = (freqArray.get(arr.get(i)));

            freqArray.set(arr.get(i), oldValue  + 1);
        }
        return freqArray;

    }

    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(countingSort(arr));
    }
}
