import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int len = s.length();

        int count = 0;
        int x = 0;

        String hello = "hello";

        for (int i = 0; i<hello.length(); i++){
            for (int j = x; j<len; j++){
                if (i<=j) {
                    if (hello.charAt(i) == s.charAt(j)) {
                        x = j+1;
                        count++;
                        break;
                    }
                }
            }
        }

        if (count>=5){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
