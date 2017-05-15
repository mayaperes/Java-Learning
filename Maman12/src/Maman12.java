/**
 * Created by maya.tyntarev on 15/05/2017.
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;

public class Maman12 {

    //Q1

//    public class FishCutlet
//    {
//        public static void main (String [] args)
//        {
//            Scanner scan = new Scanner (System.in);
//            final int HEATING_TIME = 20;
//            System.out.println("It takes 20 seconds to heat one fish cutlet");
//            System.out.println ("How many cutlets would you like to heat? ");
//            int num = scan.nextInt();
//            int cutletMinutes=num*HEATING_TIME;
//            int minutes=(cutletMinutes)/60;
//            int Seconds=(cutletMinutes)%60;
//
//            System.out.println("You need to heat the cutlets for " + minutes + " and " + Seconds + " seconds");

    // Day = (D + (26×(M+1))/10 + Y + Y/4 + C/4 - 2×C) mod 7
    // D day
    // M number of month (january and february are 13 and 14)
    // Y last 2 numbers in year (for ex 2008 is 08)
    // C first 2 numbers in year (for ex 2008 is 20)

    //Q2
    public static void main(String[] arg) {
        int Day;
        int D = 0;
        int M;
        int yearFromStringToInteger;
        int Y;
        int C;

        String pattern = "yyyy-MM-dd";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a date in a format yyyy-MM-dd");
        String date = scan.nextLine();
        String[] dateParts=date.split("-");
        String year=dateParts[0];
        yearFromStringToInteger= Integer.parseInt(year);
        Y=yearFromStringToInteger%100;
        C=yearFromStringToInteger/100;

        String month=dateParts[1];
        M=Integer.parseInt(month);
        if (M<1 || M>12){
            System.out.println("Please enter valid month date");
            //System.exit(0);
        }

        switch (M){
            case 01: M=13;
                yearFromStringToInteger=yearFromStringToInteger-1;
                break;
            case 02: M=14;
                yearFromStringToInteger=yearFromStringToInteger-1;
                break;
        }



        String day=dateParts[2];
        if (D>=1 || D<=31){
            D=Integer.parseInt(day);
        }
        else System.out.println("please enter valid day date");
        //System.exit(0);

        Day = (D + (26*(M+1))/10 + Y + Y/4 + C/4 - 2*C) % 7;
        System.out.println(Day);
        switch(Day){
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }

        scan.close();

    }
}

