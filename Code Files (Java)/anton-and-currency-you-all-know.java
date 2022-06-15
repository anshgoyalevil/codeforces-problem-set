import java.util.*;
import java.io.*;

public class ProgramJava {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int evens = 0;

        StringBuilder str = new StringBuilder(sc.next());

        int ind = -1;

        int lst = Character.getNumericValue(str.charAt(str.length()-1));

        char chr = '0';

        for (int i = 0; i<str.length()-1; i++){
            char ch = str.charAt(i);
            int chV = Character.getNumericValue(ch);
            if (lst>chV && chV%2==0){
                ind = i;
                chr = ch;
                break;
            }
            else if (chV%2==0){
                chr = ch;
                ind = i;
            }
        }



        if (ind !=-1){
            str.setCharAt(ind, str.charAt(str.length()-1));
            str.setCharAt(str.length()-1, chr);
            System.out.println(str);
        }
        else System.out.println(-1);

    }
}
