import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rem = 1;

        int min = Integer.MAX_VALUE;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        ArrayList<Integer> maxes = new ArrayList<Integer>();

        for (int i = 0; i<n; i++){
            arr.add(sc.nextInt());
        }

        for (int i = 1; i<n-1; i++){
            int temp = arr.get(rem);
            arr.remove(rem);
            int max = -1;
            for (int j = 1; j<n-1; j++){
                max = Math.max(max, arr.get(j) - arr.get(j-1));
            }
            maxes.add(max);
            arr.add(rem, temp);
            rem++;
        }

        for (int i = 0; i<maxes.size(); i++){
            min = Math.min(min, maxes.get(i));
        }

        System.out.println(min);

    }
}
