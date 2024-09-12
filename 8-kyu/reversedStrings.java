/**
 * Reversed Strings
 * https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
 * 
  Complete the solution so that it reverses the string passed into it.

  'world'  =>  'dlrow'
  'word'   =>  'drow'
 */

 public class reversedStrings {

  public static String solution(String str) {
    // System.out.println()
    System.out.println(str);
    String ans = "";
    
    for(int i = str.length() - 1; i >= 0; i--) {
      System.out.println(String.valueOf(str.charAt(i)));
      ans = ans.concat(String.valueOf(str.charAt(i)));
    }
    return ans;
  }
}

/**
 the concat() method in Java does not modify the String directly. Strings in Java are immutable, meaning any method that appears to "modify" a string actually returns a new string with the modification, rather than altering the original string in place.

 This is why ans = ans.concat(...)

 // ALTERNATIVE SOLUTION WITH STRING BUILDER
  public class Kata {

  public static String solution(String str) {
    StringBuilder ans = new StringBuilder();
    
    for(int i = str.length() - 1; i >= 0; i--) {
      ans.append(str.charAt(i));
    }
    return ans.toString();
  }

}
 */

