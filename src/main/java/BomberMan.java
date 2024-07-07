import java.util.ArrayList;
import java.util.List;

public class BomberMan {
    public static List<String> bomberMan(int n, List<String> grid) {

        if(n==1){
            return grid;
        }
        if(n%2 == 0){
            List<String> endResultFullBombs = new ArrayList<>();
            for(int i= 0; i<grid.size(); i++){
                String row = "";
                for(int j= 0; j<grid.get(0).length();j++ ){
                    row += "O";
                }
                endResultFullBombs.add(row);
            }
            return endResultFullBombs;
        }
        if(n%4 == 1){
             return gridMap(gridMap(grid));
        }



        return  gridMap(grid);
    }

    public static List<String> gridMap(List<String> grid) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i<grid.size(); i++){
            String row = grid.get(i);
            String ansRow = "";
            for(int j = 0; j<row.length(); j++){
                if(row.charAt(j) == 'O'){
                    ansRow += ".";
                    continue;
                }
                if(checkBomb(grid,i,j)){
                    ansRow += ".";
                }else{
                    ansRow += "O";
                }
            }
            result.add(ansRow);
        }
        return result;
    }

    private static boolean checkBomb(List<String> grid,int i,int j) {
        if (i - 1 >= 0 && grid.get(i - 1).charAt(j) == 'O') {
            return true;
        }

        if (i + 1 < grid.size() && grid.get(i + 1).charAt(j) == 'O') {
            return true;
        }
        if (j - 1 >= 0 && grid.get(i).charAt(j - 1) == 'O') {
            return true;
        }

        int len = grid.get(0).length();
        if (j + 1 < len && grid.get(i).charAt(j + 1) == 'O') {
            return true;
        }

        return false;
    }
}
