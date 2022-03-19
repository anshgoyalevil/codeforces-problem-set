import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        int a = 0;
        int b = 0;
        int c = 0;
        boolean flag = false;

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        mainLoop:
        for (int i = 0; i<n-2; i++){
            for (int j = i+1; j<n-1; j++){
                for (int k = j+1; k<n; k++){
                    if (arr[i] + arr[j] == arr[k] || arr[j] + arr[k] == arr[i] || arr[k] + arr[i] == arr[j]){
                        flag = true;

                        if (arr[i] > arr[j] && arr[i] > arr[k]){
                            a = k+1;
                            b = j+1;
                            c = i+1;
                        }
                        else if (arr[j] > arr[i] && arr[j] > arr[k]){
                            a = k+1;
                            b = i+1;
                            c = j+1;
                        }
                        else{
                            a = i+1;
                            b = j+1;
                            c = k+1;
                        }
                        
                        break mainLoop;
                    }
                }
            }
        }

        if (flag){
            System.out.println(c + " " + a + " "+ b);
        }
        else {
            System.out.println(-1);
        }

    }
}
