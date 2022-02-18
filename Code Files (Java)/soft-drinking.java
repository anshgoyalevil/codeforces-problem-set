import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int total_drink_shares = (k*l)/nl;

        int salt_shares = (p/np);

        int lime_shares = (c*d);

        int min = Math.min(total_drink_shares, Math.min(salt_shares, lime_shares));

        System.out.println( min/n);

    }

}
