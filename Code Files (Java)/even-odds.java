import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        long nDiv;
        if (n%2== 0){
            nDiv = (n/2) +1;
        }
        else {
            nDiv = (n/2) + 2;
        }

        long nElse;
        if (n%2==0)
            nElse = (n/2);
        else
            nElse = (n/2) + 1;

        if (k<nDiv){
            System.out.println(1 + (k-1)*2);
        }
        else {
            System.out.println(2 + (k-nElse-1)*2);
        }

    }

}
