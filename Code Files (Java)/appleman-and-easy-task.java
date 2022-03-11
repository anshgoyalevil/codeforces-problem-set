import java.io.DataInputStream;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class ProgramJava {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        int n = sc.nextInt();
        int r = 0;
        int c = 0;

        char [][] arr = new char[n][n];

        for (int i = 0; i<n; i++){
            String str = sc.next();
            for (int j = 0; j<n; j++){
                arr[i][j] = str.charAt(j);
            }
        }
        outer:
        for (int i = 0; i<n; i++){

            for (int j = 0; j<n; j++){
                int adj = 0;
                /*if (arr[i][j] == 'x'){*/
                    if (j>0){
                        if (arr[i][j-1] == 'o'){
                            adj = adj + 1;
                        }
                    }
                    if (j<n-1){
                        if (arr[i][j+1] == 'o'){
                            adj = adj + 1;
                        }
                    }
                    if (i>0){
                        if (arr[i-1][j] == 'o'){
                            adj = adj + 1;
                        }
                    }
                    if (i<n-1){
                        if (arr[i+1][j] == 'o'){
                            adj = adj + 1;
                        }
                    }
                    if (adj%2 != 0){
                        flag = false;
                        break outer;
                    }
                /*}*/
            }
        }

        if (flag) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");

        }
    }
}
