/**
 * Created by Kevin on 11/27/16.
 * 102. Linked List Cycle
 */
import com.github.zhuolikevin.datastructure.ListNode;

public class LinkedListCycle {
  /**
   * @param head: The first node of linked list.
   * @return: True if it has a cycle, or false
   */
  public boolean hasCycle(ListNode head) {
    if (head == null) { return false; }
    ListNode slow = head;
    ListNode fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) { return true; }
    }
    return false;
  }
}
