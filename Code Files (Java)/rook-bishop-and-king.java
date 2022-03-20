import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class NewProg {



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int rookMoves = -1;
        int bishopMoves = -1;
        int kingMoves = -1;

        if (r1 == r2 && c1 == c2){
            rookMoves = 0;
        }
        else if (r1 == r2 || c1 == c2){
            rookMoves = 1;
        }
        else {
            rookMoves = 2;
        }

        if ((r1+c1)%2==0 && (r2+c2)%2!=0 || (r1+c1)%2!=0 && (r2+c2)%2==0){
            bishopMoves = 0;
        }
        else if (Math.abs(r1-r2) == Math.abs(c1-c2)){
            bishopMoves = 1;
        }
        else {
            bishopMoves = 2;
        }

        kingMoves = Math.max(Math.abs(r1 - r2), Math.abs(c1-c2));

        System.out.println(rookMoves + " " + bishopMoves + " " + kingMoves);

    }
}
