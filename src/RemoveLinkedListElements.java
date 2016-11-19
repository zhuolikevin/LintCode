/**
 * Created by Kevin on 11/19/16.
 * 452. Remove Linked List Elements
 */
import com.github.zhuolikevin.datastructure.ListNode;

public class RemoveLinkedListElements {
  /**
   * @param head a ListNode
   * @param val an integer
   * @return a ListNode
   */
  public ListNode removeElements(ListNode head, int val) {
    // Write your code here
    ListNode fakeHead = new ListNode(-1);
    fakeHead.next = head;
    ListNode pre = fakeHead;
    while (head != null) {
      if (head.val == val) {
        pre.next = head.next;
      } else {
        pre = pre.next;
      }
      head = head.next;
    }
    return fakeHead.next;
  }
}
