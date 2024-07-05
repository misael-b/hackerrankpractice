import java.io.IOException;

public class CounterGame {
    public static String counterGame(long n){
        if(n == 1){
            return "Richard";
        }

        int counter = 0;
        while (n != 1){


            long remainder = (long) Math.floor((Math.log(n)/Math.log(2)));
            long number = (long) Math.pow(2,remainder);
            if((n-number) == 0){
                n = n/2;

            }else{
                n = n-number;
            }

            counter++;

        }
        if(counter %2 ==0){
            return "Richard";
        }
        return "Louise";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(counterGame(1533726144));
//        System.out.println(Math.floor((Math.log(1620434450)/Math.log(2))));
    }
}
