import java.util.*;
import java.util.stream.Collectors;


public class ProgramJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        ArrayList<Integer> zero = new ArrayList<Integer>();
        ArrayList<Integer> posM = new ArrayList<Integer>();
        ArrayList<Integer> negM = new ArrayList<Integer>();
        ArrayList<Integer> zeroM = new ArrayList<Integer>();

        for (int i = 0; i<n; i++){
            int in = sc.nextInt();
            if (in < 0){
                neg.add(in);
            }
            else if (in > 0){
                pos.add(in);
            }
            else zero.add(in);
        }

        if (neg.size()%2 != 0){
            negM.addAll(neg);
        }
        else {
            negM.addAll(neg);
            zero.add(negM.get(negM.size()-1));
            negM.remove(negM.size()-1);
        }

        if (pos.size() == 0){
            pos.add(negM.get(0));
            pos.add(negM.get(1));
            negM.remove(0);
            negM.remove(0);
        }

        posM.addAll(pos);

        zeroM.addAll(zero);

        System.out.print(negM.size()+ " ");
        for (Integer integer : negM) {

            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.print(posM.size()+ " ");
        for (Integer integer : posM) {

            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.print(zeroM.size() +" ");
        for (Integer integer : zeroM) {

            System.out.print(integer + " ");
        }

    }

}
