import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision1 {

    public static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;
        for(int i = 0; i<s.size() - m +1; i++){
            List<Integer> subArray = s.subList(i,i+m);
//            System.out.println(s.size());
            int arrayTotal = 0;
            for(int num : subArray){
                arrayTotal = arrayTotal + num;
            }
            if(arrayTotal == d){
                counter++;
            }



        }
        return counter;

    }

    public static void main(String[] args) throws IOException {
        List<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        s.add(2);
        System.out.println(birthday(s, 4, 2));
//        birthday(s, 4, 2);

    }
}
