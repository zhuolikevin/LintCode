/**
 * Created by Kevin on 12/16/16.
 * 67. Binary Tree Inorder Traversal
 */
import com.github.zhuolikevin.datastructure.TreeNode;
import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
  private ArrayList<Integer> result = new ArrayList<Integer>();
  /**
   * @param root: The root of binary tree.
   * @return: Inorder in ArrayList which contains node values.
   * Recursive
   */
  public ArrayList<Integer> inorderTraversal(TreeNode root) {
    helper(root);
    return result;
  }
  private void helper(TreeNode root) {
    if (root == null) { return; }
    helper(root.left);
    result.add(root.val);
    helper(root.right);
  }
  /**
   * @param root: The root of binary tree.
   * @return: Inorder in ArrayList which contains node values.
   * Iterative
   */
  public ArrayList<Integer> inorderTraversal2(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode curNode = root;
    while (!stack.isEmpty() || curNode != null) {
      if (curNode != null) {
        stack.push(curNode);
        curNode = curNode.left;
      } else {
        curNode = stack.pop();
        result.add(curNode.val);
        curNode = curNode.right;
      }
    }
    return result;
  }
}
