import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> max = new ArrayList<Integer>();

        int [][] arr = new int[n][2];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<n; i++){
            if (k>=arr[i][1]){
                max.add(arr[i][0]);
            }
            else {
                max.add(arr[i][0] - arr[i][1] + k);
            }
        }

        Collections.sort(max);

        System.out.println(max.get(max.size()-1));

    }

}
