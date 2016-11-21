/**
 * Created by Kevin on 11/21/16.
 * 9. Fizz Buzz
 */
import java.util.ArrayList;

public class FizzBuzz {
  /**
   * param n: As description.
   * return: A list of strings.
   */
  public ArrayList<String> fizzBuzz(int n) {
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) {
        result.add("fizz buzz");
      } else if (i % 3 == 0) {
        result.add("fizz");
      } else if (i % 5 == 0) {
        result.add("buzz");
      } else {
        result.add(String.valueOf(i));
      }
    }
    return result;
  }
}
