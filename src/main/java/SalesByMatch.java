import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        if(n==0 || n==1){
            return 0;
        }
        int matches = 0;
        int compareNum = ar.get(0);
        while (ar.size() > 1){
            for(int i = 1; i<ar.size(); i++) {
                if (compareNum == ar.get(i)) {
                    matches++;
                    ar.remove((Integer) compareNum);
                    ar.remove((Integer) compareNum);
                    compareNum = ar.get(0);
                    i = 0;
                n= n-2;
                }



//                i = 0;
            }
            if(!(ar.size() == 1) ){
                ar.remove((Integer) compareNum);
                compareNum = ar.get(0);
            }



        }
        return matches;



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
