/**
 * Created by Kevin on 11/26/16.
 */
import java.util.HashSet;

public class UniqueCharacters {

  /**
   * @param str: a string
   * @return: a boolean
   * Time O(n)  Space O(n)
   */
  public boolean isUnique(String str) {
    HashSet<Character> set = new HashSet<Character>();
    for (int i = 0; i < str.length(); i++) {
      if (set.contains(str.charAt(i))) { return false; }
      else {
        set.add(str.charAt(i));
      }
    }
    return true;
  }
  /**
   * @param str: a string
   * @return: a boolean
   * Time O(n^2) Space O(1)
   */
  public boolean isUnique2(String str) {
    // write your code here
    for (int i = 0; i < str.length(); i++) {
      for (int j = 0; j < str.length(); j++) {
        if (i == j) { continue; }
        if (str.charAt(i) == str.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }
  /**
   * @param str: a string
   * @return: a boolean
   * If all the characters in the string are ascii codes,
   * there should be at most 256 possibilities.
   *
   * Time O(n) Space only 256 bits, Better than O(n)
   */
  public boolean isUnique3(String str) {
    boolean[] list = new boolean[256];
    for (int i = 0; i < str.length(); i++) {
      char curChar = str.charAt(i);
      if (list[curChar]) { return false; }
      else { list[curChar] = true; }
    }
    return true;
  }
}
