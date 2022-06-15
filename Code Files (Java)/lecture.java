import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class ProgramJava {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, String> hm = new HashMap<>();

        for(int i=0; i<m; i++){
            String s1 = sc.next();
            String s2 = sc.next();
            hm.put(s1, s2);
        }

        for (int i = 0; i<n; i++){
            String st = sc.next();
            if (st.length() <= hm.get(st).length()){
                System.out.print(st+ " ");
            }
            else {
                System.out.print(hm.get(st) + " ");
            }
        }

        System.out.println();

    }
}
