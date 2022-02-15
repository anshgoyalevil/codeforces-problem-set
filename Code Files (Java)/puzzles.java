import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int [] arr = new int[m];

        for (int i = 0; i<m; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        int h = 0;
        int l = 0;

        for (int i = 0; i<m-n+1; i++){
            l = arr[i];
            h = arr[i+n-1];
            min = Math.min(min, h-l);
        }

        System.out.println(min);

    }
}
