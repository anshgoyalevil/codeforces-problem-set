import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();

        double l = sc.nextInt();

        ArrayList<Double> arr = new ArrayList<Double>();

        for (int i = 0; i<n; i++){
            arr.add((double)sc.nextInt());
        }

        Collections.sort(arr);

        double maxDiff = 0;

            for (int i = 0; i < n - 1; i++) {
                maxDiff = Math.max(maxDiff, arr.get(i + 1) - arr.get(i));
            }

            if (arr.get(0) - 0 >= l - arr.get(arr.size()-1)) {

                if ((arr.get(0) - 0) >= maxDiff / 2d) {
                    System.out.println(arr.get(0) - 0);
                }
                else if (l - arr.get(arr.size()-1) >= maxDiff / 2d){
                    System.out.println( l - arr.get(arr.size()-1));
                }
                else {
                    System.out.println(maxDiff/2d);
                }
            }

            else if (arr.get(0) - 0 <= l - arr.get(arr.size()-1)){
                if (l - arr.get(arr.size()-1) >= maxDiff / 2d) {
                    System.out.println(l - arr.get(arr.size()-1));
                }
                else if ((arr.get(0) - 0) >= maxDiff / 2d) {
                    System.out.println(arr.get(0) - 0);
                }
                else {
                    System.out.println(maxDiff/2d);
                }
            }

            else {
                System.out.println(maxDiff/2d);
            }



    }

}
