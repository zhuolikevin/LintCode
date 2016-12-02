/**
 * Created by Kevin on 12/2/16.
 * 372. Delete Node in the Middle of Singly Linked List
 */
import com.github.zhuolikevin.datastructure.ListNode;

public class DeleteNodeInTheMiddleOfSinglyLinkedList {
  /**
   * @param node: the node in the list should be deleted
   * @return: nothing
   * The tricky thing here is: you don't really need
   * to delete 'this node`. You can just make the list
   * looked like without the node.
   */
  public void deleteNode(ListNode node) {
    if (node == null) { return; }
    if (node.next == null) {
      node = null;
      return;
    }
    ListNode next = node.next;
    node.val = next.val;
    node.next = next.next;
  }
}
