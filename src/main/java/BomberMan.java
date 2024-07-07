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

    private static boolean checkBomb(List<String> grid,int x,int y) {
        if (x - 1 >= 0 && grid.get(x - 1).charAt(y) == 'O') {
            return true;
        }

        if (x + 1 < grid.size() && grid.get(x + 1).charAt(y) == 'O') {
            return true;
        }
        if (y - 1 >= 0 && grid.get(x).charAt(y - 1) == 'O') {
            return true;
        }

        int len = grid.get(0).length();
        if (y + 1 < len && grid.get(x).charAt(y + 1) == 'O') {
            return true;
        }

        return false;
    }
}
