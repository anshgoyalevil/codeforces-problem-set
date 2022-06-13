import java.util.*;
import java.io.*;

 public class ProgramJava {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int d = sc.nextInt();

        StringBuilder ans = new StringBuilder();

        ans.append("9".repeat(Math.max(0, k - 1)));

        ans.append(String.valueOf(d));

        if (k != 1 && d == 0){
            System.out.println("No solution");
        }
        else if (k == 1 && d == 0){
            System.out.println(0);
        }
        else
        System.out.println(ans);

    }
}
