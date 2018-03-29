/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<List<Integer>> levelList = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return levelList;
        }
        levelOrder(root, 0);
        return levelList;
    }
    
    private void levelOrder(TreeNode root, int level){
        if(root == null){
            return;
        }
        
        if(levelList.size() <= level){
            List<Integer> list = new ArrayList<Integer>();
            levelList.add(list);
        }
        
        levelList.get(level).add(root.val);
        level++;
        levelOrder(root.left, level);
        levelOrder(root.right, level);
    }
}