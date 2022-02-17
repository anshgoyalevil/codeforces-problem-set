import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    static String brain(int s, int n, int [][] matrix){

        for (int i = 0; i<n; i++){
                if (s> matrix[i][0]){
                    s = s+ matrix[i][1];
                }
                else {
                    return "NO";
                }
        }
            return "YES";
    }

    static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2) {

                // To sort in descending order revert
                // the '>' Operator
                if (entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
            }
        });
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int [][] matrix = new int[n][2];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<2; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        sortbyColumn(matrix, 0);

        System.out.println(brain(s, n, matrix));

    }

}
