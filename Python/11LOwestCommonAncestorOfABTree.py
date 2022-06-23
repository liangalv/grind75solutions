# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#Given BST find the LCA of two given nodes in the BST 
       #Lowest common ancestor is defined between the two nodes p and q as the lowest node in T that has both p and q as descendants
       # where we allow a ndoe be a descendant of itself

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root == None:
            return None
        if (root.val == p.val) or (root.val == q.val):
            return root
        # traverse branches depending on what the values of p and q are 
        if root.val > p.val and root.val > q.val:
            return Solution.lowestCommonAncestor(self,root.left, p,q)
            #traverse the left tree
            return Solution.lowestCommonAncestor(self, root.left, p,q)
        elif root.val < p.val and root.val <q.val:
            #traverse the right tree
            return Solution.lowestCommonAncestor(self, root.right, p,q)
        else:
            if Solution.lowestCommonAncestor(self, root.left, p, q) and Solution.lowestCommonAncestor(self, root.right,p,q):
                return root
        

        
       