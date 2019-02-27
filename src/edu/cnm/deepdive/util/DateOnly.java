package edu.cnm.deepdive.util;

public class DateOnly {

  public static int elapsedDays(int year, int month, int day) {
    int [] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int count = 0;
    count = year - 1970;
    count += day;
    for( int i = 0; i <= month; i++) {
      count += daysInMonth[i];
    }
    for (int i = 1970; i <= year; i++) {
    return daysInMonth[i];
    }
    return 0;
  }

  private static boolean isLeapYear(int year) {
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
      return true;
    } else {
      return false;
    }
  }
}
