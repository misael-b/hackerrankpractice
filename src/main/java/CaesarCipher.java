import java.io.IOException;
import java.util.ArrayList;

import java.util.HashMap;


public class CaesarCipher {
    public static String caesarCipher2(String s, int k) {
        String cipher = "";
        HashMap<String, Integer> alphabet = new HashMap<>();
        alphabet.put("a", 1);
        alphabet.put("b", 2);
        alphabet.put("c", 3);
        alphabet.put("d", 4);
        alphabet.put("e", 5);
        alphabet.put("f", 6);
        alphabet.put("g", 7);
        alphabet.put("h", 8);
        alphabet.put("i", 9);
        alphabet.put("j", 10);
        alphabet.put("k", 11);
        alphabet.put("l", 12);
        alphabet.put("m", 13);
        alphabet.put("n", 14);
        alphabet.put("o", 15);
        alphabet.put("p", 16);
        alphabet.put("q", 17);
        alphabet.put("r", 18);
        alphabet.put("s", 19);
        alphabet.put("t", 20);
        alphabet.put("u", 21);
        alphabet.put("v", 22);
        alphabet.put("w", 23);
        alphabet.put("x", 24);
        alphabet.put("y", 25);
        alphabet.put("z", 26);
        alphabet.put("A", -1);
        alphabet.put("B", -2);
        alphabet.put("C", -3);
        alphabet.put("D", -4);
        alphabet.put("E",-5);
        alphabet.put("F", -6);
        alphabet.put("G", -7);
        alphabet.put("H", -8);
        alphabet.put("I", -9);
        alphabet.put("J", -10);
        alphabet.put("K", -11);
        alphabet.put("L", -12);
        alphabet.put("M", -13);
        alphabet.put("N", -14);
        alphabet.put("O", -15);
        alphabet.put("P", -16);
        alphabet.put("Q", -17);
        alphabet.put("R", -18);
        alphabet.put("S", -19);
        alphabet.put("T", -20);
        alphabet.put("U", -21);
        alphabet.put("V", -22);
        alphabet.put("W", -23);
        alphabet.put("X", -24);
        alphabet.put("Y", -25);
        alphabet.put("Z", -26);
        ArrayList<String> specialChar = new ArrayList<>();

        ArrayList<Integer> original = new ArrayList<>();
        for(String letter: s.split("")){
            if(alphabet.containsKey(letter)){
                original.add(alphabet.get(letter));
            }
            else {
                original.add(0);
                specialChar.add(letter);
            }



        }
        ArrayList<Integer> newPhrase = new ArrayList<>();
        for(Integer number : original){
            if(number == 0){
                newPhrase.add(0);
            }else{
                if(number > 0){
                    if(((number + k) % 26) == 0){
                        newPhrase.add(26);
                    }else{
                        newPhrase.add((number + k) % 26);
                    }

                }else{
                    if(((number - k) % 26) == 0){
                        newPhrase.add(-26);
                    }else{
                        newPhrase.add((number - k) % 26);
                    }

                }

            }

        }
        int i = 0;

        for(Integer num : newPhrase){
            if(num == 0){
                cipher += specialChar.get(i);
                i++;
            }else{
                for(String letter : alphabet.keySet()){
                    if(alphabet.get(letter) == num){
                        cipher += letter;
                    }

                }
            }

        }
        return cipher;
    }

//    public static String caesarCipher(String s, int k) {
//        String[] arrayOfString = new String[s.length()];
//        int i = 0;
//        String cipher = "";
//        for(String letter : s.split("")){
//            if(i-k >=0){
//                arrayOfString[(i-k)] = letter;
//            }else{
//                arrayOfString[(i+(s.length()-k))] = letter;
//            }
//
//            i++;
//        }
//        System.out.println(Arrays.toString(arrayOfString));
//
//        return Arrays.toString(arrayOfString);
//    }

    public static void main(String[] args) throws IOException {
        String string = "159357lcfd";
        caesarCipher2(string, 98);

    }
}
