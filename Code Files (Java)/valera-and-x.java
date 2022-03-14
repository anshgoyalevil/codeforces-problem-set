import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = 0;
        int r = n-1;
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        HashMap<Character, Integer> all = new HashMap<Character, Integer>();

        String [] arr = new String[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.next();
        }

        for (int i = 0; i<n; i++){

                hs.put(arr[i].charAt(l), hs.getOrDefault(arr[i].charAt(l), 0) + 1);
                hs.put(arr[i].charAt(r), hs.getOrDefault(arr[i].charAt(r), 0) + 1);
                l = l+1;
                r = r-1;

        }

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                all.put(arr[i].charAt(j), all.getOrDefault(arr[i].charAt(j), 0) + 1);
            }
        }

        if (hs.containsValue(n*2) && all.containsValue((n*2)-1) && all.containsValue((n*n)-(n*2)+1)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
