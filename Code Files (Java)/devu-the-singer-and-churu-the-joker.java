import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int songs = 0;

        int sumOfSongs = 0;

        for (int i = 0; i<n; i++){
            int in = sc.nextInt();
            sumOfSongs = sumOfSongs + in;
        }

        d = d - sumOfSongs;

        int relTime = (n-1)*10;

        d = d - relTime;

        if (d>=0){
            d = d + relTime;
            songs = d/5;
        }
        else {
            songs = -1;
        }

        System.out.println(songs);

    }
}
