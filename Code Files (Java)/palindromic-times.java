import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class ProgramJava {

    static String fromMinutesToHHmm(long minutes) {
        long hours1 = (TimeUnit.MINUTES.toHours(Long.valueOf(minutes)));
        long hours = (TimeUnit.MINUTES.toHours(Long.valueOf(minutes)))%24;
        long remainMinutes = minutes - TimeUnit.HOURS.toMinutes(hours1);
        return String.format("%02d:%02d", hours, remainMinutes);
    }

    static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);

            String time = sc.next();

            long minutes = 0;

            String[] split = time.split(":");
            if(split.length == 2) {
                minutes = TimeUnit.HOURS.toMinutes(Integer.parseInt(split[0])) +
                        Integer.parseInt(split[1]);

            }

            for (int i = 1; i<1440-minutes+1; i++){
                if (isPalindrome(fromMinutesToHHmm(minutes+i))){
                    System.out.println(fromMinutesToHHmm(minutes+i));
                    break;
                }
            }

    }
}
