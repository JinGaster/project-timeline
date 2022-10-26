public class hashmapNode<K, V> {
	private K key;
	private V value;
    private int data;
    private hashmapNode<K, V> nextNode;
    // creation of important stuff
    
	public hashmapNode(K k, V v, int d, hashmapNode<K, V> n){
		this.key = k;
		this.value = v;
        this.data = d;
        this.nextNode = n;
    }
	// constructor
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
    public int getData() {
    	return data;
    }
    public hashmapNode<K, V> getNextNode() {
    	return nextNode;
    }
    // getters
    
    public void setKey(K k) {
		key = k;
	}
	public void setValue(V v) {
		value = v;
	}
    public void setData(int d){
        data = d;
    }
    public void setNextNode(hashmapNode<K, V> n){
        nextNode = n;
    }
    // setters
}