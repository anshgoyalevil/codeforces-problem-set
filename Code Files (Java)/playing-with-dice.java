import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aWin = 0;
        int bWin = 0;
        int draw = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i<7; i++){
            if (Math.abs(a-i) < Math.abs(b-i)){
                aWin++;
            }
            else if (Math.abs(b-i) < Math.abs(a-i)){
                bWin++;
            }
            else {
                draw++;
            }
        }

        System.out.println(aWin+" "+draw+ " " + bWin);

    }

}
