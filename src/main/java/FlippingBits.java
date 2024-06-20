import java.io.IOException;

public class FlippingBits {

    public static long flippingBits(long n) {
        // Write your code here
        String longString = Long.toBinaryString(n);
        if(longString.length() != 32){
            String zero="";
            for(int i = 0; i<32-longString.length(); i++){
                zero += "0";
            }
            longString = zero + longString;
        }

        StringBuilder newString = new StringBuilder();
        for(int i = 0; i<longString.length(); i++){
            if(longString.charAt(i) == '0'){
                newString.append("1");
            }else{
                newString.append("0");
            }

        }
        String result = newString.toString();

        return Long.parseLong(result,2);

    }

    public static void main(String[] args) throws IOException {
        long longValue = 1;
        System.out.println(flippingBits(longValue));;

    }
}
