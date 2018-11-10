import java.util.Arrays;

/*
1. Sort the source int list in ascending order;
2. compare the mid value with toBeFoundValue;
3. change the [start, end] scope, until find the final result
4. return -1 if not find the result
*/

public class BinarySearch {
  public static int findKey(int toBeFoundValue, int[] sourceIntList){
    Arrays.sort(sourceIntList);
    int start = 0;
    int end = sourceIntList.length - 1;
    while (start <= end){
      int mid = start + (end - start)/2;
      if (sourceIntList[mid] > toBeFoundValue)
        end = mid - 1;
      else if (sourceIntList[mid] < toBeFoundValue)
        start = mid + 1;
      else
        return mid;
    }
    return -1;
  }


}
