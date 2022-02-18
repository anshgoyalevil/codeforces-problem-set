import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i<n;i++){
            arr.add(sc.nextInt());
        }
        int left = 5-k;
        Collections.sort(arr);
        int quantity = 0;
        for (int i = 0; i<n; i++){
            if (arr.get(i) <= left){
                quantity++;

            }
        }

        System.out.println(quantity/3);

    }

}
