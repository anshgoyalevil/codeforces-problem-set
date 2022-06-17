import java.util.*;
import java.io.*;

public class ProgramJava {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        long ans = n + n-1 + arr[0];

        for (int i = 0; i<n-1; i++){
            if (arr[i] < arr[i+1]){
                ans = ans + arr[i+1] - arr[i];
            }
            else if (arr[i] > arr[i+1]){
                ans = ans + arr[i] - arr[i+1];
            }
        }

        System.out.println(ans);

    }
}
