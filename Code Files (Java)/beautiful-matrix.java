import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[5][5];

        int p = 0;
        int q = 0;
        int setter = 0;
        int ans = 0;

        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                setter = sc.nextInt();
                if (setter == 0){
                    arr[i][j] = setter;
                }
                else {
                    arr[i][j] = setter;
                    p = i+1;
                    q = j+1;
                }
            }
        }

        if ((p == 1 && q == 1) || (p == 5 && q == 1) || (p == 1 && q == 5) || (p == 5 && q == 5)){
            ans = 4;
        }
        else if ((p == 1 && q == 2) || (p == 1 && q == 4) || (p == 5 && q == 2) || (p == 5 && q == 4) || (p == 2 && q == 1) || (p == 2 && q == 5) || (p == 4 && q == 1) || (p == 4 && q == 5)){
            ans = 3;
        }
        else if ((p == 1 && q == 3) || (p == 5 && q == 3) || (p == 3 && q == 1) || (p == 3 && q == 5) || (p == 2 && q == 2) || (p == 2 && q == 4) || (p == 4 && q == 2) || (p == 4 && q == 4)){
            ans = 2;
        }
        else if ((p == 2 && q == 3) || (p == 3 && q == 2) || (p == 3 && q == 4) || (p == 4 && q == 3)){
            ans = 1;
        }
        else {
            ans = 0;
        }

        System.out.println(ans);
    }
}
