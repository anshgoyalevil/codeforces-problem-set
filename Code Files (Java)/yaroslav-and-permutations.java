import java.util.*;
import java.io.*;

 public class ProgramJava {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i<n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        int mx = -1;
        int mxKey = -1;

        for (Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if (mx < entry.getValue()){
                mx = entry.getValue();
                mxKey = entry.getKey();
            }
        }

        int lefts = 0;

        for (Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if (entry.getKey()!=mxKey){
                lefts = lefts+ entry.getValue();
            }
        }

        if (mx - 1 <= lefts){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
