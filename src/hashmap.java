public class hashmap<K, V> {
	int maxSize = 10;
	int size = 0;
	hashmapNode[] hashmapArray = new hashmapNode[maxSize];
	
	// add method
	public void add(K k, V v){
		// hashmaps will only have a "nextNode" when there is a collision, otherwise they will be in different spots
		hashmapNode<K, V> newHashmapNode = new hashmapNode(k, v, 0, null);
		// when a hashmap adds a node, test to make sure if that node is already taken.
		hashmapNode<K, V> addTraversal = hashmapArray[(Math.abs(k.hashCode()) % maxSize)];
		if (hashmapArray[(Math.abs(k.hashCode()) % maxSize)] == null) {
			
			//hashmapNode temp = null;
			//for(int i = 0; i < maxSize; i++) {         // this block of code automatically assigns
				//if(hashmapArray[i] != null) {          // temp, a hashmapNode, to the first node
					//temp = hashmapArray[i];            // in the hashmapArray, using a
					//break;                             // for loop.
				//}
				//System.out.println(hashmapArray[i].getNextNode()); /*returns null because the node added does not collide with any others*/
			//}
			
			//System.out.println("apple");
			// base case: when the position the node is going to be inserted into is null.
			// when this happens, it sets the position of hashCode modulo 10 in the array to
			// newHashmapNode, the new hashmapNode.
			this.hashmapArray[Math.abs(k.hashCode()) % maxSize] = newHashmapNode;
			
			// (commented out)
			// after setting the newHashmapNode to the new position, make temp traverse through
			// the list until it finds a node that is behind newHashmapNode. afterwards, it will
			// set that node as the previous node of newHashmapNode.
			/*if(size != 0 && temp.getNextNode() != null) {
				// only trigger these statements if newHashmapNode has a previous node
				// to begin with.
				//System.out.println(size);
				//System.out.println(temp);
				//System.out.println(newHashmapNode);
				while(temp.getNextNode() != newHashmapNode) {
					temp = temp.getNextNode();
					//System.out.println(temp);
					//System.out.println(newHashmapNode);
					if(temp.getNextNode() == null) {
						break; // placeholder
					}
				}
				temp.setNextNode(newHashmapNode);
			}*/
		}
		else {
			//System.out.println("orange");
			// when the position the node is going to be inserted into is not null (meaning it's taken).
			// when this happens, it will add onto the linked list in the array
			while(addTraversal.getNextNode() != null) {
				// this while loop will iterate through the list to find the next spot
				// that is null, to which then it will insert the newHashmapNode.
				addTraversal = addTraversal.getNextNode();
			}
			addTraversal.setNextNode(newHashmapNode);
		}
		size++;
		
		// once the hashmap's size reaches 3/4ths of its max capacity, resizing will take place, where a
		// new array will be generated that has the maxSize of the previous array's maxSize, squared.
		// in addition, all the previous elements will be added onto this new array, with different
		// placements, as it's going to be a new hashmap.
		if(size == Math.round((.75)*(maxSize))) {
			// Math.round((.75)*(maxSize)) is equal to 8
			// the Math.round() statement makes it so that whatever 75% of maxSize is, it's not a decimal.
			// this is so the if statement can actually function.
			resize();
		}
    }
	
	public void resize() {
		// start at the beginning of the array and go through it until it finds something that isn't null.
		// since nextNodes and positions are not preserved, simply move the data to the new hashmap.
		// afterwards, find the next node, but once there is none, go to the next position in the array and
		// do the same thing.
		
		//step 0: start resizing.
		//System.out.println("(List of " + size + " entries is 75% of its maxSize. Resizing in progress. Please wait...)");
		
		// step 1: set defaults (temp will be set to the beginning of the array).
		hashmapNode<K, V> temp = null;
		for(int i = 0; i < maxSize; i++) {
			if(hashmapArray[i] != null) {
				temp = hashmapArray[i];
				break;
			}
		}
		K k = temp.getKey();
		hashmapNode[] hashmapArray2 = new hashmapNode[(maxSize * maxSize)];
		hashmapNode<K, V> resizingTraversal = new hashmapNode(temp.getKey(), temp.getValue(), 0, null);
		//System.out.println(resizingTraversal);
		int counter = 0;
		
		// step 2: "iterate" through the array until it finds something that isn't null.
		// add that to the new list, and then repeat.
		for(int i = 0; i < maxSize; i++) {
		//int i = 0;
		//while(i < maxSize) {
			//System.out.println(i);
			// the problem: if the if condition returns true, then it will use up "1" of the for loop's iterations,
			//              without actually going through the else condition.
			// the problem 2: when "i" decreases, counter still increases, and thus counter will go too far before
			//                "i" reaches the maxSize it's limited to.
			//k = temp.getKey();
			if(temp == null) {
				//System.out.println("a");
				// temp is null here, so it can't get its nextNode...
				// but instead, it will use the array!
				// ...assuming that it doesn't cause counter to overflow above the maxSize of the array.
				
				// this if statement goes through the else condition for the first few times, until it
				// eventually switches over to the primary if statement, to which it gets stuck...
				if(counter+1 >= maxSize) {
					// infinite loop here
					break;
				}
				else {
					temp = hashmapArray[counter+1];
					counter++;
				}
				//System.out.println(i);
				i--;
				//System.out.println(counter);
			} else {
				resizingTraversal = new hashmapNode(temp.getKey(), temp.getValue(), 0, null);
				//i++;
				k = temp.getKey();
				//System.out.println("b");
				// get the pos of resizingTraversal with the data of temp and make a new node
				//System.out.println(hashmapArray2[(Math.abs(k.hashCode()) % maxSize)]); /*outputs null*/
				//resizingTraversal = hashmapArray2[(Math.abs(k.hashCode()) % maxSize)];
				
				// the problem: this sets resizingTraversal equal to the other statement, which is null, instead of actually
				//              adding the node.
				// the solution: to add the node, do it as if you were adding a node for the first time; which is, check the
				//               position it's at, and if it's null, place it, if not, iterate until you do.
				
				//System.out.println(hashmapArray2[(Math.abs(k.hashCode()) % (maxSize * maxSize))]);
				hashmapNode<K, V> addTraversal = hashmapArray2[(Math.abs(k.hashCode()) % (maxSize * maxSize))];
				if (hashmapArray2[(Math.abs(k.hashCode()) % (maxSize * maxSize))] == null) {
					//System.out.println("banana");
					// base case: when the position the node is going to be inserted into is already null.
					// when this happens, it sets the position of hashCode modulo 100 in the array to
					// resizingTraversal, the new hashmapNode.
					hashmapArray2[Math.abs(k.hashCode()) % (maxSize * maxSize)] = resizingTraversal;
				} else {
					// super important thing you have to remember when resizing: when moving the node over to
					// the new hashmap, you have to check to see if that node also has a nextNode, and if it
					// does, you'll have to move that node also.
					// don't forget to re-hash its position to remove the collision thingy.
					
					//System.out.println("carpet");
					// when the position the node is going to be inserted into is not null (meaning it's taken).
					// when this happens, it will add onto the linked list in the array
					//int test = 0;
					while(addTraversal.getNextNode() != null) {
						// this while loop will iterate through the list to find the next spot
						// that is null, to which then it will insert resizingTraversal.
						addTraversal = addTraversal.getNextNode();
						//if(addTraversal == addTraversal.getNextNode()) {
						//	break;
						//}
						
						//System.out.println(test);
						//test++;
						//System.out.println(addTraversal); /*returns the same node over and over again*/
						//System.out.println(addTraversal.getNextNode()); /*returns the same node as addTraversal*/
						
						// the problem: addTraversal's nextNode is the same as itself, causing an infinite while loop.
						// the cause: the key doesn't change before the for loop loops again.
						// the solution: make the key change, but make sure it doesn't take the key of null.
						//System.out.println("bruh moment");
					}
					addTraversal.setNextNode(resizingTraversal);
				}
				size++;
				//System.out.println(temp.getKey());
				if(temp.getNextNode() != null) {
					resizingTraversal = new hashmapNode(temp.getKey(), temp.getValue(), 0, null);
					temp = temp.getNextNode();
				} else {
					temp = temp.getNextNode();
					//System.out.println(resizingTraversal);
				}
				//resizingTraversal = temp;
				//resizingTraversal.setData(temp.getData());
			}
		}
		
		// step 3: multiply maxSize by itself to square it.
		maxSize = maxSize * maxSize;
		
		// step 4: set hashmap2 as the new default hashmapArray.
		hashmapArray = hashmapArray2;
		
		// step 5: complete the function and stuff like that.
		//System.out.println("(Resizing complete. Your list can now hold a max capacity of " + (maxSize * maxSize) + " entries, instead of the previous " + maxSize + ".)");
		
		
		// (commented out)
		/*String temp = null;
		for(int i = 0; i < maxSize; i++) {
			if(hashmapArray[i] != null) {
				temp = hashmapArray[i].getKey();
				break;
			}
		}
		String k = temp;
		hashmapNode[] hashmapArray2 = new hashmapNode[(maxSize * maxSize)];
				   /* (placeholder) */
		//hashmapNode resizingTraversal = hashmapArray2[(Math.abs(k.hashCode()) % maxSize)]; 
		//hashmapNode resizingTraversal = hashmapArray[(Math.abs(k.hashCode()) % maxSize)];
		//System.out.println(hashmapArray[(Math.abs(k.hashCode()) % maxSize)].getNextNode()); /*outputs a hashmapNode*/
		//System.out.println(hashmapArray[(Math.abs(k.hashCode()) % maxSize)].getNextNode().getNextNode()); /*outputs null*/
		/*System.out.println("resizing in progress...");
		//k = resizingTraversal.getKey();
		for (int i = 0; i < maxSize; i++) {
			// this for loop will iterate through the original hashmapArray and move
			// all the items to the new hashmapArray, assigning them each new placements,
			// since this is a bigger hashmap.
			//System.out.println(i);
			
			// idea 1: set each node in the new array as the node in the previous array, but modulo maxSize squared.
			//System.out.println((Math.abs(k.hashCode()) % maxSize^2));
			// problem #1: resizingTraversal is set to null (and also the first node of the new hashmapArray is null),
			//             so nothing isn't really working.
			//resizingTraversal.setData((Math.abs(k.hashCode() % maxSize*maxSize)));
			//resizingTraversal.setNextNode(hashmapArray[(Math.abs(k.hashCode()) % maxSize)].getNextNode());
			//resizingTraversal = resizingTraversal.getNextNode();
			
			// idea 2: go through the previous list, and set those nodes to new positions in the new array.
			// problem #2: the first node of hashmapArray2 is null (basically problem #1).
			//hashmapArray2[(Math.abs(k.hashCode()) % maxSize)].setData(resizingTraversal.getData());
			//hashmapArray2[(Math.abs(k.hashCode()) % maxSize)].setNextNode(resizingTraversal.getNextNode());
			//hashmapArray2[(Math.abs(k.hashCode()) % maxSize)] = hashmapArray2[(Math.abs(k.hashCode()) % maxSize)].getNextNode();
			//resizingTraversal = resizingTraversal.getNextNode();
			
			// idea 3: instead of moving the nodes, move the data, so that the collisions are taken care of.
			// this can be done by taking the data from the old array to the new array via the processes
			// in the add method.
			// problem #3: k.hashCode() might not be needed since k isn't an iterator, and the while
			//             loop keeps looping infinitely.
			// problem #3.5: the node itself is being moved and arranged into the new array, but its
			//               nextNode value is still the same and hasn't been moved, causing errors.
			
			//newHashmapNode = new hashmapNode(k, v, resizingTraversal.getData(), null);
			/*resizingTraversal = resizingTraversal; (instead of having a newHashmapNode entirely,
			                                          resizingTraversal will be used so it can more
			                                          efficiently move all the nodes from the old
			                                          array to the new one.)*/
			
			// when a newHashmapNode is added, test to make sure if that node is already taken.
			/*hashmapNode addTraversal = hashmapArray2[(Math.abs(k.hashCode()) % (maxSize * maxSize))];
			if (hashmapArray2[(Math.abs(k.hashCode()) % (maxSize * maxSize))] == null) {
				// System.out.println("apple");
				// base case: when the position the node is going to be inserted into is null.
				// when this happens, it sets the position of hashCode modulo 10 in the array to
				// newHashmapNode, the new hashmapNode.
				hashmapArray2[Math.abs(k.hashCode()) % (maxSize * maxSize)] = resizingTraversal;
				
				// probably used for something, keep this for now, might need it later
				//addTraversal.setData(hashmapArray2[(Math.abs(k.hashCode()) % (maxSize * maxSize))].getData());
				//addTraversal.setNextNode(addTraversal.getNextNode());
				// can't get the next node of addTraversal if addTraversal is null...
			} else {
				// System.out.println("orange");
				// when the position the node is going to be inserted into is not null (meaning
				// it's taken).
				// when this happens, it will add onto the linked list in the array
				while (addTraversal.getNextNode() != null) {
					// this while loop will iterate through the list to find the next spot
					// that is null, to which then it will insert the newHashmapNode.
					addTraversal = addTraversal.getNextNode();
					//System.out.println(addTraversal);
				}
				addTraversal.setNextNode(resizingTraversal);
			}
			// before the for loop loops again, set the key to the key of the next node.
			//System.out.println(resizingTraversal.getNextNode());
			//System.out.println(resizingTraversal.getNextNode().getKey()); /*outputs a hashmapNode key*/
			/*if(resizingTraversal.getNextNode() != null) {
				k = resizingTraversal.getNextNode().getKey();
			} else {
				break; // placeholder
			}
			// the problem: for the first few times it seems to be working, but at one point
			//              resizingTraversal.getNextNode() returns null, and thus, it breaks,
			//              as it cannot get a key from a node that is null.
			// the cause: hashmapArray[(Math.abs(k.hashCode()) % maxSize)] is returning a node
			//            that is not at the first position.
			// the solution(?): make a new String variable that represents k that isn't a parameter.
			
			// the problem 2: the first time, it correctly outputs the nextNode and the nextNode's
			//                key. however, the second time it runs, the nextNode is null, and thus
			//                the program breaks, as it cannot get a key from a node that is null.
			// the cause 2: when the program adds a newHashmapNode, it's not attaching that as
			//              the nextNode of the previous node that was added.
			
			// afterwards, set resizingTraversal to its nextNode.
			resizingTraversal = resizingTraversal.getNextNode();
		}
		// after the for loop runs, the entire array has been resized, and the last thing
		// to edit is the maxSize, which will become squared.
		maxSize = maxSize * maxSize;*/
		// (end of code quarantine, you can now stop proceeding with caution)
	}
	
	// getKey method
	public K getKey(K k){
		// only returns key
		
		// find a way to make k the key of the first ever entry (wait no dont do that)
		//hashmapNode temp = null;
		//for(int i = 0; i < maxSize; i++) {
		//	if(hashmapArray[i] != null) {
		//		temp = hashmapArray[i];
		//		break;
		//	}
		//}
		//k = temp.getKey();
		
		hashmapNode<K, V> keyTraversal = hashmapArray[(Math.abs(k.hashCode()) % maxSize)];
		
		// print statement facility v2
		//System.out.println("------------------");
		//System.out.println(hashmapArray[(Math.abs(k.hashCode()) % maxSize)]); /*outputs null*/
		//System.out.println(keyTraversal); /*outputs null, same as above*/
		//System.out.println(Math.abs(k.hashCode()) % maxSize); /*outputs 90*/
		//System.out.println(maxSize); /*outputs 100*/
		//System.out.println(k); /*outputs the key (493845...)*/
		//System.out.println("------------------");
		
		if(hashmapArray[(Math.abs(k.hashCode()) % maxSize)].getKey() == k) {
			// base case: if the first entry in the linked list is the correct one (no iteration is needed).
			//System.out.println("apple");
	        return (K) hashmapArray[(Math.abs(k.hashCode()) % maxSize)].getKey();
		}
		else {
			// if the first entry in the linked list is NOT the correct one (iteration is needed).
			//System.out.println("orange");
			
			// print statement facility v1:
			//System.out.println(keyTraversal.getKey());
			//System.out.println(k);
			//System.out.println(keyTraversal.getKey() != k);
			//System.out.println(keyTraversal.getNextNode().getKey());
			//System.out.println(k);
			//System.out.println(keyTraversal.getNextNode().getKey() != k);
			
			//System.out.println(k);
			
			// the problem: keyTraversal might not be at the right place as it is checking to find
			//              the node (problem in this method), OR the node is missing (problem w/ resizing).
			// the solution: find out which problem it is.
			while(keyTraversal.getKey() != k) {
				//System.out.println(keyTraversal.getKey());
				//System.out.println(keyTraversal.getNextNode());
				
				// iterate through the linked list, checking if the node has the right key.
				keyTraversal = keyTraversal.getNextNode();
				
				// print statement facility v2:
				//System.out.println(keyTraversal.getKey());
				//System.out.println(keyTraversal.getNextNode());
				//System.out.println(keyTraversal.getKey() != k);
			}
			// make sure you return the correct node
			
			// hashmap entry 7: 49384w^&%dfGBNH, yeah4
			//System.out.println(keyTraversal.getKey());
			
	        return keyTraversal.getKey();
		}
    }
	
	// getValue method
	public V getValue(K k){
		// only returns value

		// find a way to make k the key of the first ever entry (wait no dont do that)
		//hashmapNode temp = null;
		//for(int i = 0; i < maxSize; i++) {
		//	if(hashmapArray[i] != null) {
		//		temp = hashmapArray[i];
		//		break;
		//	}
		//}
		//k = temp.getKey();

		hashmapNode<K, V> valueTraversal = hashmapArray[(Math.abs(k.hashCode()) % maxSize)];
		if(hashmapArray[(Math.abs(k.hashCode()) % maxSize)].getKey() == k) {
			// base case: if the first entry in the linked list is the correct one (no iteration is needed).
	        return (V) hashmapArray[(Math.abs(k.hashCode()) % maxSize)].getValue();
		}
		else {
			// if the first entry in the linked list is NOT the correct one (iteration is needed).
			while(valueTraversal.getKey() != k) {
				// iterate through the linked list, checking if the node has the right value.
				valueTraversal = valueTraversal.getNextNode();
			}
			// make sure you return the correct node
	        return valueTraversal.getValue();
		}
    }
	
	// getData method (basically getKey + getValue)
	public String getData(K k) {
		// returns both key and value
        return "key: " + this.getKey(k) + ", value: " + this.getValue(k);
        // find a way of calling the two other functions for the hashmap instead of the hashmapNode
	}
	
	// the problem #1: the getKey and getValue methods are only returning the first entry in the linked list in the array.
	//                 it's returning the position in the array that stores the linked list, but doesn't go one step
	//                 further to find the correct node that stores the correct key.
	// the solution #1: iterate through the list to find the node that has the right key within the linked list. if
	//                  the node isn't the one you're looking for, go to the nextNode.
}