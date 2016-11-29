/**
 * Created by Kevin on 11/29/16.
 * 469. Identical Binary Tree
 */
import com.github.zhuolikevin.datastructure.TreeNode;
import java.util.Stack;

public class IdenticalBinaryTree {
  /**
   * @param a, b, the root of binary trees.
   * @return true if they are identical, or false.
   * Recursive
   */
  public boolean isIdentical(TreeNode a, TreeNode b) {
    if (a == null && b != null) { return false; }
    if (a != null && b == null) { return false; }
    if (a == null && b == null) { return true; }
    if (a.val != b.val) { return false; }
    return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
  }
  /**
   * @param a, b, the root of binary trees.
   * @return true if they are identical, or false.
   * Iterative
   */
  public boolean isIdentical2(TreeNode a, TreeNode b) {
    Stack<TreeNode> stackA = new Stack<TreeNode>();
    Stack<TreeNode> stackB = new Stack<TreeNode>();
    stackA.push(a);
    stackB.push(b);
    while (!stackA.empty() || !stackB.empty()) {
      if (stackA.empty() && !stackB.empty()) { return false; }
      if (!stackA.empty() && stackB.empty()) { return false; }
      TreeNode curA = stackA.pop();
      TreeNode curB = stackB.pop();
      if (curA == null && curB != null) { return false; }
      if (curA != null && curB == null) { return false; }
      if (curA == null && curB == null) { continue; }
      if (curA.val != curB.val) { return false; }
      stackA.push(curA.right);
      stackB.push(curB.right);
      stackA.push(curA.left);
      stackB.push(curB.left);
    }
    return true;
  }
}
