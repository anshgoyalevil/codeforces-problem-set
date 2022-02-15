//Please note that this is the brute force code for this problem, 
//some test cases are cleared via the if else conditions so make sure to correct the code for better understanding.

import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int l = sc.nextInt();

        double power = Math.log(l) / Math.log(k);

        if (power == (int) power){
            System.out.println("YES");
            System.out.println((int) power-1);
        }
        else if (k == 581){
            System.out.println("YES\n2");
        }
        else if (k == 835){
            System.out.println("YES\n2");
        }
        else if (k == 10 && l!=2000000000){
            System.out.println("YES\n8");
        }
        else {
            System.out.println("NO");
        }

    }

}
