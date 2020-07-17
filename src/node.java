
public class node {
	private int data;
	//default is 0, data stored as number
	private node nextNode;
	//default is null, data stored as string
	public node(node n, int d){
        this.data = d;
        this.nextNode = n;
    }
	//constructor
	public node getNextNode(){
        return nextNode;
    }
    public int getData(){
        return data;
    }
    //getters
    
    //woah man you do comments really well, good job
    //thanks man, you too
    
    public void setData(int d){
        data = 0;
    }
    public void setNextNode(node n){
        nextNode = n;
    }
   //setters
    
    public String toString() {
		String temp = "";
		temp = "node with value " +this.data+ ".";
		return temp;
    }
}
