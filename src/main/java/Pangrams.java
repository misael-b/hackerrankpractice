import java.io.IOException;
import java.util.ArrayList;

public class Pangrams {
    public static String pangrams(String s) {
        // Write your code here
        String [] letters = s.toLowerCase().split("");
        ArrayList<String> lettersInString = new ArrayList<>();
        for(String letter : letters){
            if(!lettersInString.contains(letter.toLowerCase()) && !letter.equals(" ")){
                lettersInString.add(letter.toLowerCase());
            }
        }
        if(lettersInString.size() == 26){
            return "pangram";
        }else {
            return "not pangram";
        }

    }
    public static void main(String[] args) throws IOException {
        String phrase = "We promptly judged antique ivory buckles for the next prize";
        String phrase2 = "We promptly judged antique ivory buckles for the prize";
        System.out.println(pangrams(phrase));
        System.out.println(pangrams(phrase2));
    }
}
