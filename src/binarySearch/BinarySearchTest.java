package binarySearch;

import java.util.Arrays;

public class BinarySearchTest {
  private static int[] initArray = {1, 2, 4, 7, 12, 461, 562, 123, 256, 10};
  private static int toBeFoundValue = 123;

  public static void main(String[] args){
    Arrays.sort(initArray);
    int result = BinarySearch.findKey(toBeFoundValue, initArray);
    if (result == -1)
      System.out.println("Result not found");
    else
      System.out.println("Result found: " + result);
  }
}
