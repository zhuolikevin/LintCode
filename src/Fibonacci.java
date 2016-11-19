/**
 * Created by Kevin on 11/19/16.
 * 366. Fibonacci
 */
public class Fibonacci {
  /**
   * @param n: an integer
   * @return an integer f(n)
   */
  public int fibonacci(int n) {
    if (n < 1) {
      throw new IllegalArgumentException("Invalid input!");
    }
    if (n == 1) { return 0; }
    if (n == 2) { return 1; }
    int first = 0;
    int second = 1;
    for (int i = 3; i <= n; i++) {
      int temp = first + second;
      first = second;
      second = temp;
    }
    return second;
  }
}
