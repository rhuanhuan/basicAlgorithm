/*
1. The source int list should be in ascending order;
2. compare the mid value with toBeFoundValue;
3. change the [start, end] scope, until find the final result
4. return -1 if not find the result
*/

public class BinarySearch {
  public static int findKey(int toBeFoundValue, int[] ascendingIntList){
    int start = 0;
    int end = ascendingIntList.length - 1;
    while (start <= end){
      int mid = start + (end - start)/2;
      if (ascendingIntList[mid] > toBeFoundValue)
        end = mid - 1;
      else if (ascendingIntList[mid] < toBeFoundValue)
        start = mid + 1;
      else
        return mid;
    }
    return -1;
  }


}
