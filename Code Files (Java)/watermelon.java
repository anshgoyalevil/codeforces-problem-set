import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc=new Scanner(System.in);

        int T = sc.nextInt();

        if (T%2 == 0 && T>2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
