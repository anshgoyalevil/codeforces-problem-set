import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class ProgramJava {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n+2];

        for (int i = 1; i<n+1; i++){

            arr[i] = sc.nextInt();

        }

        arr[n+1] = Integer.MAX_VALUE;

        int peakInd = 1;

        int peaks = 0;

        for (int i = 1; i<arr.length-1; i++){
            if(arr[i-1] < arr[i] && arr[i+1] < arr[i]){
                peakInd = i;
                peaks++;
            }
        }

        int peakMax = -1;
        int peakMin = Integer.MAX_VALUE;
        int peakStop = -1;

        for (int i = peakInd; i<arr.length; i++){
            peakMax = Math.max(peakMax, arr[i]);
            peakMin = Math.min(peakMin, arr[i]);
            if (arr[i] < arr[i+1]){
                peakStop = i;
                break;
            }
        }

        boolean flag1 = true;
        boolean flag2 = true;

        for (int i = 0; i<peakInd; i++){
            if (arr[i] > peakMin){
                flag1 = false;
                break;
            }
        }

        for(int i = peakStop+1; i<n+2; i++){
            if (arr[i] < peakMax){
                flag2 = false;
                break;
            }
        }

        if (flag1 && flag2 && peaks <=1){
            System.out.println("yes");
            System.out.println(peakInd + " " + peakStop);
        }
        else System.out.println("no");

    }
}
