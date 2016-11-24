/**
 * Created by Kevin on 11/19/16.
 */
import com.github.zhuolikevin.datastructure.TreeNode;

public class Main {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(0);
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    TreeNode d = new TreeNode(4);
    TreeNode e = new TreeNode(5);
    root.left = a;
    root.right = b;
    b.left = c;
    b.right = d;
    d.right = e;
    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
    System.out.println(solution.maxDepth2(root));
  }
}
