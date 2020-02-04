import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MonthsCounter {
    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public static void countMonthsFromBirthDate() {
        System.out.println("This is a program which calculate how many months passed from your birth date.");
        System.out.println("Give me your birth day:");
        Scanner scanBirthDate = new Scanner(System.in);
        int day = scanBirthDate.nextInt();
        System.out.println("Give me your birth month (in number):");
        int month = scanBirthDate.nextInt();
        System.out.println("Give me your birth year:");
        int year = scanBirthDate.nextInt();
        System.out.println("Your birth date is: " + day + "-" + month + "-" + year + ".");
    }




}
