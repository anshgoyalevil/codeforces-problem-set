import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        int [][] arr = new int[n][2];
        int up, down, left, right;
        int x,y;

        for (int i = 0; i<n; i++){
            for (int j = 0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<n; i++){
            up = down = left = right = 0;
            x = arr[i][0];
            y = arr[i][1];

            for (int j = 0; j<n; j++){
                if (x == arr[j][0]){
                    if (arr[j][1] > y){
                        up++;
                    }
                    if (arr[j][1] < y){
                        down++;
                    }
                }
                if (y == arr[j][1]){
                    if (arr[j][0] > x){
                        right++;
                    }
                    if (arr[j][0] < x){
                        left++;
                    }
                }
            }

            if (up>0 && down>0 && left>0 && right>0){
                count++;
            }

        }
        System.out.println(count);

    }

}
