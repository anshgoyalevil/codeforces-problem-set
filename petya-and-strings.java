import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String a = A.toLowerCase();
        String b = B.toLowerCase();

        int comp = a.compareTo(b);

        if (comp == 0){
            System.out.println(0);
        }
        else if (comp < 0){
            System.out.println(-1);
        }
        else {
            System.out.println(1);
        }

    }
}
