import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int valueLeft = 0;
        int valueRight = 0;
        int rowNum = 0;

        // Write your code here
        for(List<Integer> row : arr){
            int valueNum = 0;
            for (Integer value : row){
//                System.out.println(value);
                if (rowNum == valueNum){
                    valueLeft = valueLeft + value;
                }
                if(rowNum + valueNum == arr.size()-1){
                    valueRight = valueRight+value;
                }
                valueNum++;

            }
            rowNum++;

        }
        return Math.abs(valueLeft - valueRight);

    }

    public static void main(String[] args) throws IOException {
        List<Integer> arrRow1 = new ArrayList<>();
        List<Integer> arrRow2 = new ArrayList<>();
        List<Integer> arrRow3 = new ArrayList<>();
        arrRow1.add(11);
        arrRow1.add(2);
        arrRow1.add(4);
        arrRow2.add(4);
        arrRow2.add(5);
        arrRow2.add(6);
        arrRow3.add(10);
        arrRow3.add(8);
        arrRow3.add(-12);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(arrRow1);
        arr.add(arrRow2);
        arr.add(arrRow3);
        System.out.println(diagonalDifference(arr));

    }


}
