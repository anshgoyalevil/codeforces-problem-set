import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        String D = sc.next();
        String gr = "";
        int grCh = 0;

        int aL = A.length() - 2;
        int bL = B.length() - 2;
        int cL = C.length() - 2;
        int dL = D.length() - 2;

        if ((2*aL <= bL && 2*aL <= cL && 2*aL <= dL) || (aL >= 2*bL && aL >= 2*cL && aL >= 2*dL)){
            gr = "A";
            grCh++;
        }
        if ((2*bL <= aL && 2*bL <= cL && 2*bL <= dL) || (bL >= 2*aL && bL >= 2*cL && bL >= 2*dL)){
            gr = "B";
            grCh++;
        }
        if ((2*cL <= aL && 2*cL <= bL && 2*cL <= dL) || (cL >= 2*aL && cL >= 2*bL && cL >= 2*dL)){
            gr = "C";
            grCh++;
        }
        if ((2*dL <= aL && 2*dL <= bL && 2*dL <= cL) || (dL >= 2*aL && dL >= 2*bL && dL >= 2*cL)){
            gr = "D";
            grCh++;
        }
        if (grCh>1 || grCh==0){
            System.out.println("C");
        }
        else {
            System.out.println(gr);
        }

    }
}
