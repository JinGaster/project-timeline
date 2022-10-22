
public class treeNode<E extends Comparable<E>> {
	private E data;
	//default is 0, data stored as number
	private treeNode<E> leftNode;
	private treeNode<E> rightNode;
	private treeNode<E> prevNode;
	//default is null, data stored as strings
	public treeNode(treeNode<E> l, treeNode<E> r, E d, treeNode<E> p){
        this.data = d;
        this.leftNode = l;
        this.rightNode = r;
        this.prevNode = p;
    }
	//constructor
	public treeNode<E> getLeftNode(){
        return leftNode;
    }
	public treeNode<E> getRightNode() {
		return rightNode;
	}
    public E getData(){
        return data;
    }
    public treeNode<E> getPrevNode() {
    	return prevNode;
    }
    //getters
    
    //o wow this is a new class for a treeNode
    //at least you still do comments pretty well
    //thanks man you too
    
    public void setData(E d){
        data = d; /*bruh i accidentally had this as 0*/
    }
    public void setLeftNode(treeNode<E> l){
        leftNode = l;
    }
    public void setRightNode(treeNode<E> r){
        rightNode = r;
    }
    public void setPrevNode(treeNode<E> p) {
    	prevNode = p;
    }
   //setters
    
    public String toString() {
		String temp = "";
		temp = "treeNode with value " +this.data+ "...";
		return temp;
    }
}
