import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution4 {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        for(String stringInQueries: queries){
            Integer appearances = 0;
            for(String stringInString: strings){
                if(stringInString.equals(stringInQueries)){
                    appearances++;
                }
            }
            results.add(appearances);
        }
        return results;

    }

    public static void main(String[] args) throws IOException {
        List<String>strings = new ArrayList<>();
        List<String>queries = new ArrayList<>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");
        System.out.println(matchingStrings(strings, queries));


    }


}
