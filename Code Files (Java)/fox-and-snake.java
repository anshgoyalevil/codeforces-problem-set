import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;

        for (int r = 0; r<n; r++) {

            if (i < n) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                System.out.println();

                i = i + 1;
            }
            else break;

            if (i < n) {
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.println();
                i = i + 1;
            }
            else break;
            if (i < n) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                System.out.println();

                i = i + 1;
            }
            else break;
            if (i < n) {
                System.out.print("#");
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }

                System.out.println();
                i = i+1;

            }
            else break;
        }


    }

}
