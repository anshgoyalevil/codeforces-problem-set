import java.io.DataInputStream;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class ProgramJava {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] perms = new int[n];

        for (int i = 0; i<n; i++){
            if (i%2==0){
                perms[i] = i+2;
            }
            else {
                perms[i] = i;
            }
        }

        if (n%2==0){

        for (int e: perms) {
            System.out.print(e + " ");
        }
        }
        else {
            System.out.println(-1);
        }

    }
}
