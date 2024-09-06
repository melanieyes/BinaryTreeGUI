
public class Node{
    //constructor
    int data;
    Node left;
    Node right;
    
    //This method put data in the Node of the tree
    public Node(int data) {
		this.data = data;
	}
    
    //This method gets the data of a Node in the tree
    public int getValue() { return data; }
    
    //This method gets the next node located in the left of another node
    public Node getLeft() { return left; }
    /*In the binary tree sets the node to the left, only if it's less than other node.
    it also receives an int, int that will be stored in the node seted*/
    public Node setLeft(int data) {
	left = new Node(data);
	return left;
    }
    
    //This method gets the next node located in the right of another node
    public Node getRight() { return right; }
    /*In the binary tree sets the node to the right, only if it's larger than other node.
    it also receives an int, int that will be stored in the node seted*/
    public Node setRight(int data) {
	right = new Node(data);
	return right;
    }   
}
