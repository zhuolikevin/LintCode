/**
 * Created by Kevin on 12/6/16.
 * 85. Insert Node in a Binary Search Tree
 */
import com.github.zhuolikevin.datastructure.TreeNode;

public class InsertNodeInABinarySearchTree {
  /**
   * @param root: The root of the binary search tree.
   * @param node: insert this node into the binary search tree
   * @return: The root of the new binary search tree.
   * Recursive
   */
  public TreeNode insertNode(TreeNode root, TreeNode node) {
    if (root == null) { return node; }
    helper(root, node);
    return root;
  }
  private void helper(TreeNode root, TreeNode node) {
    if (root.val > node.val) {
      if (root.left != null) {
        helper(root.left, node);
      } else {
        root.left = node;
      }
    } else {
      if (root.right != null) {
        helper(root.right, node);
      } else {
        root.right = node;
      }
    }
  }
  /**
   * @param root: The root of the binary search tree.
   * @param node: insert this node into the binary search tree
   * @return: The root of the new binary search tree.
   * Iterative
   */
  public TreeNode insertNode2(TreeNode root, TreeNode node) {
    if (root == null) { return node; }
    TreeNode curNode = root;
    while (true) {
      if (curNode.val > node.val) {
        if (curNode.left != null) {
          curNode = curNode.left;
        } else {
          curNode.left = node;
          break;
        }
      } else if (curNode.val < node.val) {
        if (curNode.right != null) {
          curNode = curNode.right;
        } else {
          curNode.right = node;
          break;
        }
      }
    }
    return root;
  }
}
