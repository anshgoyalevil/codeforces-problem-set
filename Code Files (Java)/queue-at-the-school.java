import java.util.*;
import java.io.*;

 public class ProgramJava {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int t = sc.nextInt();

        StringBuilder str = new StringBuilder(sc.next());

        for (int i = 0; i<t; i++){

            for (int j = 0; j<n-1;){
                if (str.charAt(j) == 'B' && str.charAt(j+1) == 'G'){
                    str.setCharAt(j, 'G');
                    str.setCharAt(j+1, 'B');
                    j=j+2;
                }
                else {
                    j++;
                }
            }
        }

        System.out.println(str);

    }
}
