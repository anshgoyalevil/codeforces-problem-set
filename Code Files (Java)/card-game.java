import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String trumpSuit = sc.next();
        String first = sc.next();
        String second = sc.next();

        int indFirst = 0;
        int indSec = 0;
        int firstContainTrampSuit = 0;
        int secondContainTrampSuit = 0;

        HashSet<Character> tramp = new HashSet<Character>(4);
        tramp.add('S');
        tramp.add('H');
        tramp.add('D');
        tramp.add('C');

        char [] rank = {'6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};

        for (int i = 0; i<rank.length; i++){
            if (first.charAt(0) == rank[i]){
                indFirst = i;
                break;
            }
        }
        for (int i = 0; i<rank.length; i++){
            if (second.charAt(0) == rank[i]){
                indSec = i;
                break;
            }
        }

        if (first.charAt(1) == trumpSuit.charAt(0)){
            firstContainTrampSuit = 1;
        }
        if (second.charAt(1) == trumpSuit.charAt(0)){
            secondContainTrampSuit = 1;
        }

        if (firstContainTrampSuit == 0 && secondContainTrampSuit == 0){
            if (first.charAt(1) != second.charAt(1)){
                System.out.println("NO");
            }
            else if (indFirst>indSec){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else if (firstContainTrampSuit == 1 && secondContainTrampSuit == 0){
            System.out.println("YES");
        }
        else if (firstContainTrampSuit == 0 && secondContainTrampSuit == 1){
            System.out.println("NO");
        }
        else if (firstContainTrampSuit == 1 && secondContainTrampSuit == 1){
            if (indFirst>indSec){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }

}
