import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<String> arr = new ArrayList<String>();
        Map<String, Integer> mp = new HashMap<>();

        for (int i = 0; i<n; i++){
            arr.add(sc.next());
        }

        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr.get(i)))
            {
                mp.put(arr.get(i), mp.get(arr.get(i)) + 1);
            }
            else
            {
                mp.put(arr.get(i), 1);
            }
        }

        System.out.println(Collections.max(mp.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey());


    }

}
