import java.util.*;

public class JavaProgram {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        String[] strSplit = s.split("");
        String [] no = {"A", "E", "I", "O", "U", "Y", "a", "e", "i", "o", "u", "y"};

        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(strSplit));

        for (int i = 0; i< strList.size(); i++){
            for (int j = 0; j<no.length; j++){
                if (strList.get(i).equals(no[j])){
                    strList.set(i, "0");
                }
            }
        }

        String withoutVov = "";

        for (int i = 0; i<strList.size(); i++){
            if (!Objects.equals(strList.get(i), "0")){
                withoutVov = withoutVov + strList.get(i);
            }
        }

        StringBuilder builded = new StringBuilder(withoutVov);

        int wvl = withoutVov.length();

        for (int i = 0; i<wvl; i=i+2){
            builded.insert(i, ".");
            wvl++;
        }

        String finalS = String.valueOf(builded);



        System.out.println(finalS.toLowerCase());


    }
}
