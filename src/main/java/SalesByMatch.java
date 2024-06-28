import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> valmap  = new HashMap<>();
        for(int num : ar){
            if(!valmap.containsKey(num)){
                valmap.put(num, 1);
            }else{
                valmap.put(num, valmap.get(num) + 1);
            }
        }
        int matches = 0;
        System.out.println(valmap);

        for(Integer match : valmap.values()){
                matches = matches + (match /2);
        }
        return matches ;



        }



    public static void main(String[] args) throws IOException {
        int n = 10;
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(3);
        array.add(1);
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(3);
        System.out.println(sockMerchant(n,array));

    }

}
