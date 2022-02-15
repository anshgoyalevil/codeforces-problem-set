import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String strNew = str.replaceAll("WUB", " ");

        String stripped = strNew.strip();

        String string = stripped.replaceAll("\\s{2,}"," ");

        System.out.println(string);


    }
}
