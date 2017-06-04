/**
 * Created by maya.tyntarev on 16/05/2017.
 */
import java.util.Scanner;
public class Maman12Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int HEATING_TIME = 20;
        System.out.println("It takes 20 seconds to heat one fish cutlet");
        System.out.println("How many cutlets would you like to heat? ");
        int num = scan.nextInt();
        int cutletMinutes = num * HEATING_TIME;
        int minutes = (cutletMinutes) / 60;
        int Seconds = (cutletMinutes) % 60;

        System.out.println("You need to heat the cutlets for " + minutes + " and " + Seconds + " seconds");

    }
}
