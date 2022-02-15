import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc=new Scanner(System.in);

        int T = sc.nextInt();

        while (T>0){
            T--;

            String s = sc.next();

            if (s.length() > 10) {

                String n = s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1, s.length());

                System.out.println(n);
            }
            else {
                System.out.println(s);
            }

        }

    }
}
