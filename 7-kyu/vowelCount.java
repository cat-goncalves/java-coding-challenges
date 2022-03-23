/**
https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java

Vowel Count
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces

 */

 public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    for (int i = 0; i < str.length(); i++) {
      Character letter = str.charAt(i);
      if (letter.equals('a') || letter.equals('e') || letter.equals('i') ||
         letter.equals('o') || letter.equals('u')) {
        vowelsCount++;
      }
    }
    return vowelsCount;
  }
}

//ALTERNATIVE SOLUTIONS
//Regex:
public class Vowels {

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}

//Char Array
public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    
    for(char c : str.toCharArray())
      vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    
    return vowelsCount;
  }

}

//Filter
public class Vowels {

  public static int getCount(String str) {
    return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
  }

}

//Switch case
public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    for(int i = 0; i < str.length(); i++) {
        switch(str.charAt(i)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            vowelsCount++;
        }
    }
    return vowelsCount;
  }

}