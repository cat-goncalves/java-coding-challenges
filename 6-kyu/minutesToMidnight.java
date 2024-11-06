import java.util.Date;

/**
 * Minutes to Midnight
 * https://www.codewars.com/kata/58528e9e22555d8d33000163/train/javascript
 * 
 * Teemo is not really excited about the new year's eve, but he has to celebrate it with his friends anyway.

He has a really big passion about programming and he wants to be productive till midnight. He wants to know how many minutes he has left to work on his new project.
He doesn't want to look on the clock all the time, so he thought about a function, which returns him the number of minutes.

Can you write him a function, so he can stay productive?

The function minutesToMidnight(d) will take a date object as parameter. Return the number of minutes in the following format:

"x minute(s)"

You will always get a date object with of today with a random timestamp.
You have to round the number of minutes.
Milliseconds doesn't matter!


Some examples:



10.00 am => "840 minutes"

23.59 pm => "1 minute"
 */

public class minutesToMidnight {
  public String countMinutes(Date d){
    long millisecondsPerDay = 1000 * 60 * 60 * 24;
      // d.getTime() % millisecondsPerDay represents the remainder after dividing by num ms per day total
    long time = ((millisecondsPerDay - (d.getTime() % millisecondsPerDay)) / (1000 * 60));
    return time == 1 ? "1 minute" : String.valueOf(time) + " minutes";
  }
}

/**
 * Total milliseconds in a day: There are 86,400,000 milliseconds in a day (24 hours × 60 minutes × 60 seconds × 1000 milliseconds).
Get current time in milliseconds: Assume timeInMillis is the number of milliseconds since the epoch (January 1, 1970). For example, if timeInMillis is 1704102600000, it represents a specific point in time.
Calculate milliseconds since midnight:
Using the expression timeInMillis % 86400000, we find the remainder when dividing 1704102600000 by 86400000.
Calculation: 1704102600000 % 86400000 = 2000000.
Result: The result, 2000000, represents the number of milliseconds since midnight of that day. To convert it to a more understandable format:
2000000 milliseconds ÷ 1000 = 2000 seconds
2000 seconds ÷ 60 = 33.33 minutes
Thus, timeInMillis % 86400000 gives us the number of milliseconds that have passed since the start of the current day.
 */