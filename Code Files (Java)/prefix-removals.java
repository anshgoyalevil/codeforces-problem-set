import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T>0){
            T--;

            int check = -1;
            StringBuilder str = new StringBuilder(sc.next());

            outer:
            for (int i = 0; i<str.length()-1; i++){
                for (int j = i+1; j<str.length(); j++){
                    if (str.charAt(i) == str.charAt(j)){
                        str.setCharAt(i, '0');
                        check++;
                        break;
                    }


                }
                if (check !=i){
                    break outer;
                }
            }

            String strNew = str.toString().replaceAll("[0]+", "");

            System.out.println(strNew);

        }

    }
}
