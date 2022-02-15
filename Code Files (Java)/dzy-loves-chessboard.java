import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<StringBuilder> arr = new ArrayList<StringBuilder>();

        for (int i = 0; i<n; i++){
            StringBuilder str = new StringBuilder(sc.next());
            arr.add(str);
        }

        for (int i = 0; i<n; i=i+2){
            for (int j = 0; j<m; j++){
                if (j%2==0 && arr.get(i).charAt(j)=='.'){
                    arr.get(i).setCharAt(j, 'B');
                }
                else if (j%2!=0 && arr.get(i).charAt(j)=='.'){
                    arr.get(i).setCharAt(j, 'W');
                }
            }
        }
        for (int i = 1; i<n; i=i+2){
            for (int j = 0; j<m; j++){
                if (j%2==0 && arr.get(i).charAt(j)=='.'){
                    arr.get(i).setCharAt(j, 'W');
                }
                else if (j%2!=0 && arr.get(i).charAt(j)=='.'){
                    arr.get(i).setCharAt(j, 'B');
                }
            }
        }

        for (int i = 0; i<n; i++){
            System.out.println(arr.get(i));
        }

    }

}
