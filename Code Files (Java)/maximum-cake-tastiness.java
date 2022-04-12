import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T>0){
            T--;

            int N = sc.nextInt();

            int [] arr = new int[N];

            for (int i = 0; i<N; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.println(arr[N-1] + arr[N-2]);

        }

    }
}
