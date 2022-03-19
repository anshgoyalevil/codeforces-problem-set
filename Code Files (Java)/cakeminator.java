import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int cells = 0;

        int [][] arr = new int[r][c];

        for (int i = 0; i<r; i++){
            String in = sc.next();
            for (int j = 0; j<c; j++){
                if (in.charAt(j) == 'S'){
                    arr[i][j] = 2;
                }
                else {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i<r; i++){
            boolean emptyrow = false;
            int check = 0;
            for (int j = 0; j<c; j++){
                if (arr[i][j] !=2){
                    check++;
                }
            }
            if (check == c){
                emptyrow = true;
                for (int j = 0; j<c; j++){
                    arr[i][j] = 0;
                }
            }
            if (emptyrow){
                cells = cells + c;
            }
        }

        for (int i = 0; i<c; i++){
            boolean emptyrow = false;
            int check = 0;
            int inc = 0;
            for (int j = 0; j<r; j++){
                if (arr[j][i] !=2){
                    check++;
                }
            }
            if (check == r){
                emptyrow = true;
                for (int j = 0; j<r; j++){
                    if (arr[j][i] == 1){
                        inc++;
                    }
                }
            }
            if (emptyrow){
                cells = cells + inc;
            }
        }

        System.out.println(cells);

    }
}
