import java.io.IOException;

public class SuperDigit {
    public static int superDigit(String n, int k) {
        if(n.length() == 1 && k == 1){
            return Integer.parseInt(n);
        }
        int intialSumOfNum = 0;
        for(String num : n.split("")){
            intialSumOfNum += Integer.parseInt(num) ;
        }
        long sum = (long) intialSumOfNum*k;
        n = String.valueOf(sum);

//        System.out.println(n);



        while(n.length()>1){
            int sumOfNum = 0;
            for(String num : n.split("")){
                sumOfNum += Integer.parseInt(num);
            }
            n = String.valueOf(sumOfNum);
        }
        return Integer.parseInt(n);


    }


    public static void main(String[] args) throws IOException {
        String number = "148";
        System.out.println(superDigit(number, 3));
    }
}
