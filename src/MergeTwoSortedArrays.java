/**
 * Created by Kevin on 11/20/16.
 */
public class MergeTwoSortedArrays {
  /**
   * @param A and B: sorted integer array A and B.
   * @return: A new sorted integer array
   */
  public int[] mergeSortedArray(int[] A, int[] B) {
    int lenA = A.length;
    int lenB = B.length;
    if (lenA == 0) { return B; }
    if (lenB == 0) { return A; }

    int[] C = new int[lenA + lenB];
    int indexA = 0;
    int indexB = 0;
    int i = 0;
    while (indexA < lenA & indexB < lenB) {
      if (A[indexA] <= B[indexB]) {
        C[i] = A[indexA];
        indexA++;
      } else {
        C[i] = B[indexB];
        indexB++;
      }
      i++;
    }
    while (indexA < lenA) {
      C[i] = A[indexA];
      indexA++;
      i++;
    }
    while (indexB < lenB) {
      C[i] = B[indexB];
      indexB++;
      i++;
    }

    return C;
  }
}
