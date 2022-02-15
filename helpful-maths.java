import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc = new Scanner(System.in);
        String eq = sc.next();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i<eq.length(); i=i+2){
            arr.add(Character.getNumericValue(eq.charAt(i)));
        }
        Collections.sort(arr);

        String out = "";

        for (int i = 0; i<arr.size(); i++){

                out = out + arr.get(i) + "+";


        }
        System.out.println(out.substring(0, out.length()-1));

    }
}
