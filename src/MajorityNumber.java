/**
 * Created by Kevin on 12/3/16.
 * 46. Majority Number
 */
import java.util.ArrayList;
import java.util.HashMap;

public class MajorityNumber {
  /**
   * @param nums: a list of integers
   * @return: find a  majority number
   * O(n) Time O(n) Space
   */
  public int majorityNumber(ArrayList<Integer> nums) {
    HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
    int halfSize = nums.size() / 2 + 1;
    for (int i = 0; i < nums.size(); i++) {
      int curNum = nums.get(i);
      if (dict.containsKey(curNum)) {
        dict.put(curNum, dict.get(curNum) + 1);
        if (dict.get(curNum) >= halfSize) {
          return curNum;
        }
      } else {
        dict.put(curNum, 1);
      }
    }
    int majority = -1;
    for (Integer key : dict.keySet()) {
      if (dict.get(key) >= halfSize) {
        majority = key;
        break;
      }
    }
    return majority;
  }
  /**
   * @param nums: a list of integers
   * @return: find a  majority number
   * O(n) Time O(1) Space
   */
  public int majorityNumber2(ArrayList<Integer> nums) {
    int count = 1;
    int candidate = nums.get(0);
    for (int i = 1; i < nums.size(); i++) {
      int curNum = nums.get(i);
      if (curNum != candidate) {
        if (count == 0) {
          count = 1;
          candidate = curNum;
          continue;
        }
        count--;
      } else {
        count++;
      }
    }
    return candidate;
  }
}
