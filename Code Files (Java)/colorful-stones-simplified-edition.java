import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int pos = 1;

        for (int i = 0; i<t.length(); i++){

            if (s.charAt(pos-1) == t.charAt(i)){
                pos++;
            }

        }

        System.out.println(pos);

    }

}
