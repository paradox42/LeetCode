public class Solution 
{
	class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x)
		{
			val = x;
		}
	}
	
	int len;
	
	public TreeNode sortedArrayToBST(int[] nums) 
    {
        len = nums.length;
        if(len == 0)
        {
            return null;
        }
        else
        {
            //TreeNode head = constructTree(nums,0, len-1);
        	TreeNode head=null;
        	constructTree(nums, head, 0, len-1);
        	print(head);
            return head;
        }
    }
    
	private void constructTree(int[] arr, TreeNode node ,int leftIndex, int rightIndex)
    {
        if(rightIndex >= leftIndex)
        {
			int midIndex = (leftIndex + rightIndex) / 2;
			node = new TreeNode(arr[midIndex]);
			constructTree(arr, node.left,leftIndex, midIndex - 1);
			constructTree(arr, node.right ,midIndex + 1, rightIndex);
        }
    }
	/*
    private TreeNode constructTree(int[] arr, int leftIndex, int rightIndex)
    {
        if(rightIndex >= leftIndex)
        {
			int midIndex = (leftIndex + rightIndex) / 2;
			TreeNode node = new TreeNode(arr[midIndex]);
			node.left = constructTree(arr, leftIndex, midIndex - 1);
			node.right = constructTree(arr, midIndex + 1, rightIndex);
			return node;
        }
        else
        {
        	return null;
        }
    }
    */
    
    public void print(TreeNode node)
    {
    	if(node != null)
    	{
    		System.out.println(node.val);
    		print(node.left);
    		print(node.right);
    	}
    }
}
    
