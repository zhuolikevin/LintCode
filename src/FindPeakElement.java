/**
 * Created by Kevin on 11/28/16.
 * 75. Find Peak Element
 */
public class FindPeakElement {

  /**
   * @param A: An integers array.
   * @return: return any of peek positions.
   * Time O(n)
   */
  public int findPeak(int[] A) {
    if (A.length < 3) { return -1; }
    for (int i = 1; i < A.length - 1; i++) {
      if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
        return i;
      }
    }
    return -1;
  }
  /**
   * @param A: An integers array.
   * @return: return any of peek positions.
   * Time O(logn)
   */
  public int findPeak2(int[] A) {
    if (A.length < 3) { return -1; }
    int left = 0;
    int right = A.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (A[mid - 1] < A[mid] && A[mid + 1] < A[mid]) {
        return mid;
      }
      if (A[mid - 1] > A[mid]) {
        right = mid;
      } else if (A[mid + 1] > A[mid]) {
        left = mid;
      }
    }
    return -1;
  }
}
