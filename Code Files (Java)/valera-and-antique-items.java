import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int v = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> indexes = new ArrayList<Integer>();

        for (int i = 0; i<n; i++){
            arr.add(new ArrayList<Integer>());
        }

        for (int i = 0; i< n; i++){
            int tempS = sc.nextInt();
            for (int j = 0; j<tempS; j++){
                arr.get(i).add(sc.nextInt());
            }
        }

        for (int i = 0; i<n; i++){
            for (int j = 0; j<arr.get(i).size(); j++){
                if (v> arr.get(i).get(j)){
                    indexes.add(i+1);
                    break;
                }
            }
        }

        System.out.println(indexes.size());
        for (int e:indexes){
            System.out.print(e+" ");
        }

    }

}
