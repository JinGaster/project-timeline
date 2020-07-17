
public class treeNode {
	private int data;
	//default is 0, data stored as number
	private treeNode leftNode;
	private treeNode rightNode;
	private treeNode prevNode;
	//default is null, data stored as strings
	public treeNode(treeNode l, treeNode r, int d, treeNode p){
        this.data = d;
        this.leftNode = l;
        this.rightNode = r;
        this.prevNode = p;
    }
	//constructor
	public treeNode getLeftNode(){
        return leftNode;
    }
	public treeNode getRightNode() {
		return rightNode;
	}
    public int getData(){
        return data;
    }
    public treeNode getPrevNode() {
    	return prevNode;
    }
    //getters
    
    //o wow this is a new class for a treeNode
    //at least you still do comments pretty well
    //thanks man you too
    
    public void setData(int d){
        data = 0;
    }
    public void setLeftNode(treeNode l){
        leftNode = l;
    }
    public void setRightNode(treeNode r){
        rightNode = r;
    }
    public void setPrevNode(treeNode p) {
    	prevNode = p;
    }
   //setters
    
    public String toString() {
		String temp = "";
		temp = "treeNode with value " +this.data+ "...";
		return temp;
    }
}
