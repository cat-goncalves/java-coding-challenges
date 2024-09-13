/**
 * Sum of Positive
 * https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
 * 
    You get an array of numbers, return the sum of all of the positives ones.

    Example [1,-4,7,12] => 1 + 7 + 12 = 20

    Note: if there is nothing to sum, the sum is default to 0.
 */

public class sumOfPositive {
  public static int sum(int[] arr){
    
    int sum = 0;

    for(int i = 0; i < arr.length; i++) {
      if(arr[i] >= 0) {
        sum += arr[i];
      }
    }
    return sum;
  }
}

/**
 * ALTERNATIVE SOLUTION
 * 
 * public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }


 */
