import java.io.IOException;

public class PageCount {
    public static int pageCount(int n, int p) {
        // Write your code here

        if (p % 2 != 0){
            p=p-1;
        }

        int mid = n/2;
        if (p> mid){
            return (n-p)/2;
        }else{
            return (p/2);
        }



    }
    public static void main(String[] args) throws IOException {
        System.out.println(pageCount(6,5));
    }
}
