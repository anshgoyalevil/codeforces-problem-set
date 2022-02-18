import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i<n; i++){
            arr.add(Integer.toString(sc.nextInt()));
        }
        int tempC;

        for (int i = 0; i<n; i++){
            tempC = 0;
            for (int j = 0; j<arr.get(i).length(); j++){
                if (arr.get(i).charAt(j) == '4' || arr.get(i).charAt(j) == '7'){
                    tempC++;
                }
            }
            if (tempC<=k){
                count++;
            }
        }

        System.out.println(count);

    }

}
