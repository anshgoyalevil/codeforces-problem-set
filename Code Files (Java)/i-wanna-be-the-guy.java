import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> hs = new HashSet<Integer>();

        int n = sc.nextInt();

        int p = sc.nextInt();
        for (int i =0; i<p; i++){
            hs.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i =0; i<q; i++){
            hs.add(sc.nextInt());
        }
        if (n == hs.size()){
            System.out.println("I become the guy.");
        }
        else {
            System.out.println("Oh, my keyboard!");
        }

    }

}
