
public class node<E> {
	private E data;
	//default is 0, data stored as number
	private node<E> nextNode;
	//default is null, data stored as string
	public node(node<E> n, E d){
        this.data = d;
        this.nextNode = n;
    }
	//constructor
	public node<E> getNextNode(){
        return nextNode;
    }
    public E getData(){
        return data;
    }
    //getters
    
    
    public void setData(E d){
        data = d;
    }
    public void setNextNode(node<E> n){
        nextNode = n;
    }
   //setters
    
    public String toString() {
		String temp = "";
		temp = "node with value " +this.data+ ".";
		return temp;
    }
}
