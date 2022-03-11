import java.io.DataInputStream;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class ProgramJava {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();

        double m = sc.nextInt();
        boolean flag = false;
        int ind = -1;

        int minSteps = (int) Math.ceil(n/2d);
        int maxSteps = (int) n;

        for (int i = minSteps; i<=maxSteps; i++){
            if (i%m == 0){
                ind = i;
                flag = true;
                break;
            }

        }
        if (flag)
            System.out.println(ind);
        else System.out.println(-1);

    }
}
