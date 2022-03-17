/**
https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java

We need a function that can transform a number into a string.

What ways of achieving this do you know?

Examples:
123 --> "123"
999 --> "999"
 */

 class Kata {
  public static String numberToString(int num) {
    return "" + num;
  }
}

class Kata {
  public static String numberToString(int num) {
    return Integer.toString(num);
  }
}

class Kata {
  public static String numberToString(int num) {
    return String.valueOf(num);
  }
}