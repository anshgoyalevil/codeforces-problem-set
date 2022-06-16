import java.util.*;
import java.io.*;

public class ProgramJava {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = str.length();

        int k = sc.nextInt();

        int mx = -1;

        int [] arr = new int[26];

        for (int i = 0; i<26; i++){
            int in = sc.nextInt();
            arr[i] = in;
            mx = Math.max(mx, in);
        }

        long sumGreed = 0;

        for (int i = 0; i<n; i++){
            sumGreed = sumGreed + (long) (i + 1) * arr[str.charAt(i) - 97];
        }

        sumGreed = sumGreed + (mx*(((k)*((2L*n) + k + 1))/2));

        System.out.println(sumGreed);

    }
}
