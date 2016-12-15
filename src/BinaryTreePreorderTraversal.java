/**
 * Created by Kevin on 12/15/16.
 * 66. Binary Tree Preorder Traversal
 */
import com.github.zhuolikevin.datastructure.TreeNode;
import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
  public ArrayList<Integer> result = new ArrayList<Integer>();
  /**
   * @param root: The root of binary tree.
   * @return: Preorder in ArrayList which contains node values.
   * Recursive
   */
  public ArrayList<Integer> preorderTraversal(TreeNode root) {
    helper(root);
    return result;
  }
  private void helper(TreeNode root) {
    if (root == null) { return; }
    result.add(root.val);
    helper(root.left);
    helper(root.right);
  }
  /**
   * @param root: The root of binary tree.
   * @return: Preorder in ArrayList which contains node values.
   * Iterative
   */
  public ArrayList<Integer> preorderTraversal2(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (root == null) { return result; }
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode curNode = stack.pop();
      if (curNode == null) { continue; }
      result.add(curNode.val);
      stack.push(curNode.right);
      stack.push(curNode.left);
    }
    return result;
  }
}
