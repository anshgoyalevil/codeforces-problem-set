import java.util.*;

public class ProgramJava {

    static String brain(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int sideLen){
        if (y1 == y2 && x1 != x2){
            if (x2 > x1){
                sideLen = x2-x1;

                x3 = x1;
                x4 = x2;
                y3 = y1+sideLen;
                y4 = y3;
            }
            else {
                sideLen = x1-x2;
                x3 = x1;
                x4 = x2;
                y3 = y1+sideLen;
                y4 = y3;
            }
        }

        else if (x1 == x2 && y1 != y2){
            if (y2 > y1){
                sideLen = y2-y1;

                y3 = y1;
                y4 = y2;
                x3 = x1+sideLen;
                x4 = x3;
            }
            else {
                sideLen = y1-y2;
                y3 = y1;
                y4 = y2;
                x3 = x1+sideLen;
                x4 = x3;
            }
        }

        else if (Math.abs(x2-x1) == Math.abs(y2-y1)){
            sideLen = Math.abs(x2-x1);
            if (x2 > x1){
                if (y2>y1){
                    x3 = x1 + sideLen;
                    y3 = y1;
                    x4 = x2 - sideLen;
                    y4 = y2;
                }
                else {
                    x3 = x1 + sideLen;
                    y3 = y1;
                    y4 = y2;
                    x4 = x2 - sideLen;
                }
            }
            else {
                if (y2>y1){
                    x3 = x1 - sideLen;
                    y3 = y1;
                    x4 = x2 + sideLen;
                    y4 = y2;
                }
                else {
                    x3 = x1 - sideLen;
                    y3 = y1;
                    y4 = y2;
                    x4 = x2 + sideLen;
                }
            }
        }

        else {
            return "-1";
        }

        return (x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int sideLen = 0;

        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;

        System.out.println(brain(x1, y1, x2, y2, x3, y3, x4, y4, sideLen));

    }

}
