import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        long sq = a*b*c;

        int root =  (int) Math.ceil(Math.sqrt(sq));

        long x = root/a;
        long y = root/b;
        long z = root/c;

        long ans = 4*(x+y+z);
        System.out.println(ans);

    }

}
