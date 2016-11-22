/**
 * Created by Kevin on 11/22/16.
 * 82. Single Number
 */
import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {
  /**
   * Time O(n^2) Space O(1)
   * @param A : an integer array
   * return : a integer
   */
  public int singleNumber(int[] A) {
    if (A.length == 0) {
      return 0;
    }
    int singleNum = A[0];
    for (int i = 0; i < A.length; i++) {
      boolean find = false;
      for (int j = 0; j < A.length; j++) {
        if (i == j) { continue; }
        if (A[i] == A[j]) {
          find = true;
          break;
        }
      }
      if (!find) {
        singleNum = A[i];
      }
    }
    return singleNum;
  }
  /**
   * Time O(n) Space O(n)
   * @param A : an integer array
   * return : a integer
   */
  public int singleNumber2(int[] A) {
    // Time O(n^2) Space O(1)
    if (A.length == 0) { return 0; }
    HashSet<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < A.length; i++) {
      if (set.contains(A[i])) {
        set.remove(A[i]);
      } else {
        set.add(A[i]);
      }
    }
    Iterator<Integer> it = set.iterator();
    return it.next();
  }
  /**
   * Time O(n) Space O(1)
   * @param A : an integer array
   * return : a integer
   */
  public int singleNumber3(int[] A) {
    if (A.length == 0) { return 0; }
    int result = A[0];
    for (int i = 1; i < A.length; i++) {
      result = result ^ A[i];
    }
    return result;
  }
}
