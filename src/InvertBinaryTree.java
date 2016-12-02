/**
 * Created by Kevin on 12/2/16.
 * 175. Invert Binary Tree
 */
import com.github.zhuolikevin.datastructure.TreeNode;
import java.util.Stack;

public class InvertBinaryTree {
  /**
   * @param root: a TreeNode, the root of the binary tree
   * @return: nothing
   * Recursive
   */
  public void invertBinaryTree(TreeNode root) {
    if (root == null) { return; }
    TreeNode left = root.left;
    TreeNode right = root.right;
    root.left = right;
    root.right = left;
    invertBinaryTree(root.left);
    invertBinaryTree(root.right);
  }
  /**
   * @param root: a TreeNode, the root of the binary tree
   * @return: nothing
   * Iteratively
   */
  public void invertBinaryTree2(TreeNode root) {
    if (root == null) { return; }
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root);
    while (!stack.empty()) {
      TreeNode curNode = stack.pop();
      if (curNode == null) { continue; }
      TreeNode left = curNode.left;
      TreeNode right = curNode.right;
      curNode.left = right;
      curNode.right = left;
      stack.push(curNode.right);
      stack.push(curNode.left);
    }
  }
}
