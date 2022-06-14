import java.util.*;
import java.io.*;

 public class ProgramJava {

     static int solve(int A, int B)
     {
         int XOR = A ^ B;
         // Check for 1's in the binary form using
         // Brian Kerninghan's Algorithm
         int count = 0;
         while (XOR > 0) {
             XOR = XOR & (XOR - 1);
             count++;
         }
         // return the count of different bits
         return count;
     }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int[m+1];

        for (int i = 0; i<m+1; i++){
            arr[i] = sc.nextInt();
        }

        int friends = 0;

        for (int i = 0; i<m; i++){

            if (solve(arr[i], arr[m]) <= k){
                friends++;
            }

        }

        System.out.println(friends);

    }
}
