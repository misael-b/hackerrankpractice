import java.util.Arrays;

public class FindZigZagSequence {

    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n -1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n -2;
        while(st < ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main (String[] args) throws java.lang.Exception {
        int [] a = new int[7];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;

        findZigZagSequence(a, 7);

    }

}
