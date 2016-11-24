/**
 * Created by Kevin on 11/24/16.
 * 97. Maximum Depth of Binary Tree
 */
import com.github.zhuolikevin.datastructure.TreeNode;
import java.util.Stack;

public class MaximumDepthOfBinaryTree {

  /**
   * @param root: The root of binary tree.
   * @return: An integer.
   * Recursive
   */
  public int maxDepth(TreeNode root) {
    if (root == null) { return 0; }
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }
  /**
   * @param root: The root of binary tree.
   * @return: An integer.
   * Iterative
   */
  public int maxDepth2(TreeNode root) {
    if (root == null) { return 0; }
    Stack<TreeNode> treeStack = new Stack<TreeNode>();
    Stack<Integer> depthStack = new Stack<Integer>();
    int maxDepth = 0;
    treeStack.push(root);
    depthStack.push(1);
    while (!treeStack.empty()) {
      TreeNode curTreeNode = treeStack.pop();
      int curDepth = depthStack.pop();
      maxDepth = Math.max(maxDepth, curDepth);
      if (curTreeNode.right != null) {
        treeStack.push(curTreeNode.right);
        depthStack.push(curDepth + 1);
      }
      if (curTreeNode.left != null) {
        treeStack.push(curTreeNode.left);
        depthStack.push(curDepth + 1);
      }
    }
    return maxDepth;
  }
}
