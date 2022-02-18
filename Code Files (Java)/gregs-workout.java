import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int chest = 0;
        int biceps = 0;
        int back = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i<n; i++){
            arr.add(sc.nextInt());
        }

        for (int i = 0; i<n; i=i+3){
            chest = chest + arr.get(i);
        }
        for (int i = 1; i<n; i=i+3){
            biceps = biceps + arr.get(i);
        }
        for (int i = 2; i<n; i=i+3){
            back = back + arr.get(i);
        }

        if (chest>biceps && chest> back){
            System.out.println("chest");
        }
        else if (biceps > chest && biceps > back){
            System.out.println("biceps");
        }
        else if (back > biceps && back > chest){
            System.out.println("back");
        }

    }

}
