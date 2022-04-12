import java.util.*;
import java.io.*;

public class ProgramJava {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] nArr = new int[n];
        for (int i = 0; i<n; i++){
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int [] mArr = new int[m];
        for (int i = 0; i<m; i++){
            mArr[i] = sc.nextInt();
        }

        int pairs = 0;

        Arrays.sort(nArr);
        Arrays.sort(mArr);

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                if (nArr[i] == mArr[j] || nArr[i] == mArr[j] - 1 || nArr[i] - 1 == mArr[j]){
                    pairs++;
                    mArr[j] = -1;
                    break;
                }
            }
        }

        System.out.println(pairs);

    }
}
