import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        int[][] arr = new int[n][2];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n;j++){
                if (arr[i][0] == arr[j][1]){
                    count++;
                }
            }
        }

        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n;j++){
                if (arr[i][1] == arr[j][0]){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
