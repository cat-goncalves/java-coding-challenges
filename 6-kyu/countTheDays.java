import java.util.Date;

/**
 * Count The Days
 * https://www.codewars.com/kata/5837fd7d44ff282acd000157/train/java
 * 
 * Little Annie is very excited for upcoming events. She wants to know how many days she has to wait for a specific event.

Your job is to help her out.

Task: Write a function which returns the number of days from today till the given date. The function will take a Date object as parameter. You have to round the amount of days.

If the event is in the past, return "The day is in the past!"
If the event is today, return "Today is the day!"
Else, return "x days"

PS: This is my first kata. I hope you have fun^^

This kata is part of the Collection "Date fundamentals":
 */

public class countTheDays {
  public String countDays(Date d) {
    Date today = new Date();
    
    long millisecondsPerDay = 1000 * 60 * 60 * 24;
    long daysFromToday = Math.round((d.getTime() - today.getTime()) / millisecondsPerDay);
    System.out.println(daysFromToday);
    
    if (daysFromToday < 0) {
      return "The day is in the past!";
    } else if (daysFromToday == 0) {
      return "Today is the day!";
    } else {
      return String.format("%s days", daysFromToday);
    }
  }
}
