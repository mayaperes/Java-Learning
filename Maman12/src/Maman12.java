
/**
 * Created by maya.tyntarev on 15/05/2017.
 */

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Maman12 {

    static int yearFromStringToInteger;
    static String[] dateParts;
    static int LastTwoNumbersFromYear;
    static int FirstTwoNumbersFromYear;
    static int Month;
    static int D;
    static int Day;
    private static String pattern = "yyyy-MM-dd";
    static String date;
    static SimpleDateFormat sdf = new SimpleDateFormat(pattern);

    public static void main(String[] arg) {
        CreateDateAndChangeItToInteger();
        isDateValid();
        CalculateNumberOfDayAndShowDayName();

    }

    // split date format to year,month and day. then changing january to 13 and
    // year before and also changing february to 14 and one year before.
    private static void CreateDateAndChangeItToInteger() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a date in a format yyyy-MM-dd");
        date = scan.nextLine();
        dateParts = date.split("-");
        String year = dateParts[0];
        yearFromStringToInteger = Integer.parseInt(year);
        LastTwoNumbersFromYear = yearFromStringToInteger % 100;
        FirstTwoNumbersFromYear = yearFromStringToInteger / 100;
        String month = dateParts[1];
        Month = Integer.parseInt(month);
        if (Month < 1 || Month > 12) {
            System.out.println("Please enter valid month date");
        }
        if (Month == 1) {
            yearFromStringToInteger = yearFromStringToInteger - 1;
            Month = 13;
        } else if (Month == 2) {
            yearFromStringToInteger = yearFromStringToInteger - 1;
            Month = 14;
        }
        String day = dateParts[2];
        if (D >= 1 || D <= 31) {
            D = Integer.parseInt(day);
        } else
            System.out.println("please enter valid day date");
    }

    // date Validation
    public static void isDateValid() {
        try {
            sdf.setLenient(false);
            sdf.parse(date);
            System.out.println("Valid date");
        } catch (ParseException e) {
            System.out.println("Date is not valid");
            System.exit(D);
        }
    }

    // Calculating number of day and showing day name
    private static void CalculateNumberOfDayAndShowDayName() {

        Day = (D + (26 * (Month + 1)) / 10 + LastTwoNumbersFromYear + LastTwoNumbersFromYear / 4
                + FirstTwoNumbersFromYear / 4 - 2 * FirstTwoNumbersFromYear) % 7;

        switch (Day) {
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

    }

}
