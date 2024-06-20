import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for(Integer num : a){
            if(!numbers.containsKey(num)){
                numbers.put(num,1);
            }else {
                numbers.put(num, numbers.get(num)+1);
            }

        }
        System.out.println(numbers);
        for(Integer result : numbers.keySet()){
            if(numbers.get(result).equals(1)){
                return result;
            }
        }
        return a.get(0);


    }

    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        System.out.println(lonelyinteger(numbers));


    }
}
