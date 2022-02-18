import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        double misha = 0;
        double vasya = 0;

        misha = Math.max((3*a)/10d, (a-(a/250d)*c));
        vasya = Math.max((3*b)/10d, (b-(b/250d)*d));

        if (misha>vasya){
            System.out.println("Misha");
        }
        else if (vasya > misha){
            System.out.println("Vasya");
        }
        else {
            System.out.println("Tie");
        }

    }

}
