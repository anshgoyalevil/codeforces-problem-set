import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];
        boolean flagComplete = false;

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i<n; i++){
            if (i+1 !=arr[i]){
                System.out.println(i+1);
                break;
            }
            else if (i == n-1){
                flagComplete = true;
            }
        }

        if (flagComplete){
            System.out.println(n+1);
        }

    }
}
