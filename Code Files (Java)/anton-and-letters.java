import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String set = sc.nextLine();
        
        HashSet<Character> hs = new HashSet<Character>();

        for (int i = 1; i<set.length(); i=i+3){

            hs.add(set.charAt(i));
        }
        
        if(set.length() > 2)
        System.out.println(hs.size());
        else
            System.out.println(0);
    }

}
