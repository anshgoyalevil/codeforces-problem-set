import java.util.*;
import java.io.*;

public class ProgramJava {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();

        long x1 = (long) Math.ceil((double) m/(double) a);
        long x2 = (long) Math.ceil((double) n/(double) a);
        long ans = x1*x2;

        System.out.println(ans);

    }
}
