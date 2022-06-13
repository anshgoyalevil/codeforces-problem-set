import java.util.*;
import java.io.*;

 public class ProgramJava {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = String.valueOf(n);

        for (int i = str.length()-1; i>-1; i--){

            int tmp = Character.getNumericValue(str.charAt(i));

            if (tmp>4){

                int tmp2 = tmp - 5;
                int temp3 = 9 - tmp;

                System.out.print("-O|");
                for (int j = 0; j<tmp2; j++){
                    System.out.print("O");
                }
                System.out.print("-");
                for (int j = 0; j<temp3; j++){
                    System.out.print("O");
                }

            }

            else {
                System.out.print("O-|");
                int tmp3 = 4-tmp;
                for (int j = 0; j<tmp; j++){
                    System.out.print("O");
                }
                System.out.print("-");
                for (int j = 0; j<tmp3; j++){
                    System.out.print("O");
                }
            }

            System.out.println();

        }

    }
}
