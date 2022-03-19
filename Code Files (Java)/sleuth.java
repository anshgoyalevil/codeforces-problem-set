import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String strMod = str.replaceAll("\\s+","");

        String modded = strMod.toLowerCase(Locale.ROOT);
        
        boolean flag = false;

        char [] arr = {'a', 'e', 'i', 'o', 'u', 'y'};
        
        for (int i = 0; i<6; i++){
            if (modded.charAt(modded.length()-2) == arr[i]){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


    }
}
