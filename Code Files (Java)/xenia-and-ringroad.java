import java.util.*;
import java.io.*;

 public class ProgramJava {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int [] arr = new int[m+1];

        arr[0] = 1;

        for (int i = 1; i<m+1; i++){
            arr[i] = sc.nextInt();
        }

        long time = 0;

        for (int i = 1; i<m+1; i++){

            int sub = arr[i] - arr[i-1];

            if (sub<0){
                time = time + n - arr[i-1] + arr[i];
            }
            else {
                time = time + sub;
            }
        }

        System.out.println(time);

    }
}
