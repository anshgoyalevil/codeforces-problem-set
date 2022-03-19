import java.util.*;
import java.io.*;


public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n][m];

        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i<n; i++){
            String in = sc.next();
            for (int j = 0; j<m; j++){
                arr[i][j] = Character.getNumericValue(in.charAt(j));
            }
        }

        for (int i = 0; i<m; i++){
            int mx = -1;
            for (int j = 0; j<n; j++){
                mx = Math.max(mx, arr[j][i]);
            }
            for (int j = 0; j<n; j++){
                if (arr[j][i] == mx){
                    hs.add(j);
                }
            }
        }

        System.out.println(hs.size());

    }
}
