package main;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar baseCalendar = Calendar.getInstance();
        baseCalendar.set(2019, Calendar.FEBRUARY, 18);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("请输入日期：");
        int day = scanner.nextInt();

        Calendar countCalendar = Calendar.getInstance();
        countCalendar.set(year, month - 1, day);

        long days = (countCalendar.getTime().getTime() - baseCalendar.getTime().getTime()) / 24 / 3600 / 100;
        long flag = days / 7 + 1;

        if (flag % 2 == 1) {
            System.out.println( "奇数周，听经周");
        }
        if( flag % 2 == 0){
            System.out.println( "偶数周，念经周");
        }
    }
}
