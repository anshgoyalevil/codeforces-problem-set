import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    static boolean hasEight(long number)
    {
        while(number > 0)
        {
            if(number % 10 == 8)
                return true;

            number=number/10;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();

        for (long i = a+1; i<=8888888888L; i++){
            if (i<0) {
                if (hasEight(-i)) {
                    System.out.println(i - a);
                    break;
                }
            }
            else {
                if (hasEight(i)) {
                    System.out.println(i - a);
                    break;
                }
            }
        }

    }
}
