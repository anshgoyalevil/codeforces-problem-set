import java.util.*;
import java.io.*;

 public class ProgramJava {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] qs = new int[n];

        for (int i = 0; i<n; i++){
            qs[i] = sc.nextInt();
        }

        int mn = Integer.MAX_VALUE;

        for (int i = 0; i<n; i++){

            int sum = 0;

            for (int j = 0; j<qs[i]; j++){

                int in = sc.nextInt();

                sum = sum + in;

            }

            mn = Math.min((sum*5) + 15*qs[i], mn);
        }

        System.out.println(mn);

    }
}
