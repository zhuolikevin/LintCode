/**
 * Created by Kevin on 12/7/16.
 * 166. Nth to Last Node in List
 */
import com.github.zhuolikevin.datastructure.ListNode;

public class NthToLastNodeInList {
  /**
   * @param head: The first node of linked list.
   * @param n: An integer.
   * @return: Nth to last node of a singly linked list.
   */
  ListNode nthToLast(ListNode head, int n) {
    if (n <= 0) { return null; }
    ListNode slow = head;
    ListNode fast = head;
    int countDown = n;
    while (countDown > 0) {
      countDown--;
      fast = fast.next;
    }
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }
}
