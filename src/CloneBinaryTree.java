/**
 * Created by Kevin on 12/1/16.
 * 375. Clone Binary Tree
 */
import com.github.zhuolikevin.datastructure.TreeNode;
import java.util.Stack;

public class CloneBinaryTree {
  /**
   * @param root: The root of binary tree
   * @return root of new tree
   * Recursive
   */
  public TreeNode cloneTree(TreeNode root) {
    if (root == null) { return null; }
    TreeNode newRoot = new TreeNode(root.val);
    newRoot.left = cloneTree(root.left);
    newRoot.right = cloneTree(root.right);
    return newRoot;
  }
  /**
   * @param root: The root of binary tree
   * @return root of new tree
   * Iterative
   */
  public TreeNode cloneTree2(TreeNode root) {
    if (root == null) { return null; }
    Stack<TreeNode> newStack = new Stack();
    Stack<TreeNode> oldStack = new Stack();
    TreeNode newRoot = new TreeNode(root.val);
    newStack.push(newRoot);
    oldStack.push(root);
    while (!newStack.empty()) {
      TreeNode curNewNode = newStack.pop();
      TreeNode curOldNode = oldStack.pop();
      if (curOldNode.right != null) {
        TreeNode newRight = new TreeNode(curOldNode.right.val);
        curNewNode.right = newRight;
        newStack.push(newRight);
        oldStack.push(curOldNode.right);
      }
      if (curOldNode.left != null) {
        TreeNode newLeft = new TreeNode(curOldNode.left.val);
        curNewNode.left = newLeft;
        newStack.push(newLeft);
        oldStack.push(curOldNode.left);
      }
    }
    return newRoot;
  }
}
