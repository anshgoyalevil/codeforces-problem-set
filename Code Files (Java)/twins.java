import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for (int i = 0; i<n; i++){
            arr.add(sc.nextInt());
        }

        arr.sort(Collections.reverseOrder());

        int completeSum = 0;
        int sumGreed = arr.get(0);

        for (int i = 1; i<n; i++) {
            completeSum = completeSum + arr.get(i);
        }

        int sumSleep = completeSum;

        int count = 1;

        for (int i = 1; i<n; i++){
            if (sumGreed > sumSleep){
                break;
            }
            else {
                sumGreed = sumGreed + arr.get(i);
                sumSleep = sumSleep - arr.get(i);
                count++;
            }
        }

        System.out.println(count);

    }
}
