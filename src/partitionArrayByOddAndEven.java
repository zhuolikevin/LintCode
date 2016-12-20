/**
 * Created by Kevin on 12/20/16.
 * 373. Partition Array by Odd and Even
 */
public class partitionArrayByOddAndEven {
  private boolean isOdd(int num) {
    return num % 2 != 0;
  }
  /**
   * @param nums: an array of integers
   * @return: nothing
   * Time O(n) Space O(n)
   */
  public void partitionArray(int[] nums) {
    if (nums.length <= 0) { return; }
    int[] result = new int[nums.length];
    int i;
    int j = 0;
    for (i = 0; i < nums.length; i++) {
      if (isOdd(nums[i])) {
        result[j] = nums[i];
        j++;
      }
    }
    for (i = 0; i < nums.length; i++) {
      if (!isOdd(nums[i])) {
        result[j] = nums[i];
        j++;
      }
    }
    for (i = 0; i < nums.length; i++) {
      nums[i] = result[i];
    }
  }
  /**
   * @param nums: an array of integers
   * @return: nothing
   * Time O(n) Space O(1)
   */
  public void partitionArray2(int[] nums) {
    if (nums.length <= 0) { return; }
    int i = 0;
    int j = 0;
    int temp;
    while (i < nums.length) {
      if (isOdd(nums[i])) {
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j++;
      } else {
        i++;
      }
    }
  }
}
