import java.io.DataInputStream;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class ProgramJava {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> ones = new ArrayList<Integer>();
        ArrayList<Integer> twos = new ArrayList<Integer>();
        ArrayList<Integer> threes = new ArrayList<Integer>();
        int num = Integer.MAX_VALUE;

        for (int i = 0; i<n; i++){
            int in = sc.nextInt();
            if (in == 1){
                ones.add(i+1);
            }
            else if (in == 2){
                twos.add(i+1);
            }
            else if (in == 3){
                threes.add(i+1);
            }
        }

        num = Math.min(ones.size(), Math.min(twos.size(), threes.size()));

        System.out.println(num);

        if (num>0) {

            for (int i = 0; i < num; i++) {
                System.out.print(ones.get(i) + " ");
                System.out.print(twos.get(i) + " ");
                System.out.print(threes.get(i) + " ");
            }
        }
    }
}
