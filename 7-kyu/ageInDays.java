import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 * Age In Days
 * https://www.codewars.com/kata/5803753aab6c2099e600000e/train/javascript
 * 
 * Did you ever want to know how many days old are you? Complete the function which returns your age in days. The birthday is given in the following order: year, month, day.

For example if today is 30 November 2015 then

ageInDays(2015, 11, 1) returns "You are 29 days old"
The birthday is expected to be in the past.

Suggestions on how to improve the kata are welcome!
 */



public class ageInDays {
  public static String findAge(int year, int month, int day) {
    System.out.println("year: " + year + " month: " + month + " day: " + day);
    
    LocalDate today = LocalDate.now();
    LocalDate birthday = LocalDate.of(year, month, day);
    
    long diff = ChronoUnit.DAYS.between(birthday, today);
    
    System.out.println(diff);
    return "You are " + diff + " days old";
  }
}