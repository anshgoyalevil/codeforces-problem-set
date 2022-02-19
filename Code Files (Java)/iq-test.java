import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int freqOdd = 0;
        int freqEven = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i<n; i++){
            int in = sc.nextInt();
            if (in%2==0){
                freqEven++;
                arr.add(in);
            }
            else {
                freqOdd++;
                arr.add(in);
            }
        }

        if (freqEven == 1){
            for (int i = 0; i<n; i++){
                if (arr.get(i)%2==0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
        else {
            for (int i =0; i<n; i++){
                if (arr.get(i)%2!=0){
                    System.out.println(i+1);
                    break;
                }
            }
        }

    }

}
