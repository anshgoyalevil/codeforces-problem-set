import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 3;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i =0; i<n; i++){
            arr.add(sc.nextInt());
        }
        int maxV = 0;

        maxV = Math.max(arr.get(0) + arr.get(1) + arr.get(2), Math.max(arr.get(0) + arr.get(1) * arr.get(2), Math.max((arr.get(0) + arr.get(1)) * arr.get(2), Math.max(arr.get(0) * arr.get(1) * arr.get(2), Math.max(arr.get(0) * (arr.get(1) + arr.get(2)), (arr.get(0) * arr.get(1)) + arr.get(2))))));

        System.out.println(maxV);

    }

}
