// { Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class t_04
{
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(node.data);
	    if(node.left!=null&&node.right!=null) {
	        left(node.left,list);
    	    bottom(node,list);
    	    right(node.right,list);
	    }
	    else if(node.right!=null) {
	        bottom(node,list);
	        right(node.right,list);
	    }
	    else if(node.left!=null) {
	        left(node.left,list);
	        bottom(node,list);
	    }
	    return list;
	}
	void left(Node root,ArrayList<Integer> list) {
	    if(root.left==null&&root.right==null)
	    return;
	    
	    list.add(root.data);
	    if(root.left!=null)
	    left(root.left,list);
	    else
	    left(root.right,list);
	}
	void right(Node root,ArrayList<Integer> list) {
	    if(root.left==null&&root.right==null)
	    return;
	    if(root.right!=null)
	    right(root.right,list);
	    else
	    right(root.left,list);
	    list.add(root.data);
	}
	void bottom(Node root,ArrayList<Integer> list) {
	    if(root==null)
	    return;
	    bottom(root.left,list);
	    bottom(root.right,list);
	    if(root.left==null&&root.right==null)
	    list.add(root.data);
	}
}    
	     
	      
	     
	
	    

