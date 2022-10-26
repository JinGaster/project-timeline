
public class towerofhanoipast {
	public int recursiveTowers_2(int disks, int tower_1, int tower_2, int tempone, int smallPosition, int temptwo, boolean nonSmallMoveDirection, boolean smallMove, boolean oddReturn) {
		//disks state how many disks on the first tower
		//tower_1 and tower_2 describe where the disk is from, and where it should be placed
		//smallPosition describes the position of the smallest disk
		//tempone describes tower_2 before being added, so that it makes sure that tower_2 doesn't step on itself
		//temptwo ensures that the number of disks are "decreased" without the number of disks actually decreasing
		//the boolean nonSmallMoveDirection describes if the non-smallest disk should move left or right, which swaps every time.
		//the boolean smallMove describes when the smallest disk moves, or if the non-smallest disk should move, which swaps every time.
		//the boolean oddReturn is related to moving one disk to the right/left, then the next group to the left/right.
		//the boolean switchReturn makes it so the first time the disks move to the second pillar, then the next time, the third pillar.
		
		if(disks % 2 == 1) {
			//run odd commands
			//i.e smallest disk moves left every other turn
			//and the other moves include moving the other disks in a pattern of right left right
			if(smallMove = true) {
				/*move that disk to the left*/
				tower_1 = smallPosition;
				tower_2 = tower_1 - 1;
				smallPosition--;
				if(smallPosition < 1) {
					smallPosition = 3;
				}
			}
			else {
				if(nonSmallMoveDirection = true) {
					/*move that disk to the right*/
					//--tower_1 = /*the position of one of the other disks*/;
					tempone = tower_2;
					tower_2 = tower_1 + 1;
				}
				else {
					/*move that disk to the left*/
					//--tower_1 = /*the position of one of the other disks*/;
					tempone = tower_2;
					tower_2 = tower_1 - 1;
				}
			}
		}
		else {
			//run even commands
			//i.e smallest disk moves right every other turn
			//and the other moves include moving the other disks in a pattern of left right left
			if(smallMove = true) {
				/*move that disk to the right*/
				tower_1 = smallPosition;
				tower_2 = tower_1 + 1;
				smallPosition++;
				if(smallPosition > 3) {
					smallPosition = 1;
				}
			}
			else {
				if(nonSmallMoveDirection = true) {
					/*move that disk to the left*/
					//--tower_1 = /*the position of one of the other disks*/;
					tempone = tower_2;
					tower_2 = tower_1 - 1;
				}
				else {
					/*move that disk to the right*/
					//--tower_1 = /*the position of one of the other disks*/;
					tempone = tower_2;
					tower_2 = tower_1 + 1;
				}
			}
		}
		
		if(tower_2 < 1) {
			tower_2 = 3;
		}
		else if(tower_2 > 3) {
			tower_2 = 1;
		}
		if(tower_2 == smallPosition) {
			tower_2++;
			if(tower_2 > 3) {
				tower_2 = 1;
			}
			if(tower_2 == tempone) {
				tower_2++;
				if(tower_2 > 3) {
					tower_2 = 1;
				}
			}
		}
		else if(tower_2 == tempone) {
			tower_2++;
			if(tower_2 > 3) {
				tower_2 = 1;
			}
			if(tower_2 == smallPosition) {
				tower_2++;
				if(tower_2 > 3) {
					tower_2 = 1;
				}
			}
		}
		//these if statements make sure that the non-smallest disk is able to move to the only other spot it can take, and that
		//the disks never go to tower 0 nor 4
		
		//asd
		
		//System.out.println("Move the top disk from tower " +tower_1+ "to tower " +tower_2+ ".");
		if(temptwo == 3) {
			//return recursiveTowers_2(disks, tower_1, tower_2, tempone, smallPosition, temptwo, nonSmallMoveDirection, smallMove, oddReturn);
			System.out.println("Move the top disk from tower 1 to tower 3.");
			//doing the three, then move the fourth disk that was already there, then moving the three again
			//then turn those whole chunks into chunks
			temptwo = disks;
			//return recursiveTowers_2(disks, tower_1, tower_2, tempone, smallPosition, temptwo, nonSmallMoveDirection, smallMove, oddReturn);
			//placeholder return commands
			if(disks % 2 == 1) {
				oddReturn = true;
			}
			else {
				oddReturn = false;
			}
			//third, second, third, etc.
			if(oddReturn = true) {
				return recursiveTowers_2(disks, tower_1, 3, tempone, smallPosition, temptwo - 1, nonSmallMoveDirection, smallMove, false);
			}
			else {
				return recursiveTowers_2(disks, tower_1, 2, tempone, smallPosition, temptwo - 1, nonSmallMoveDirection, smallMove, true);
			}
			//booleans are good for now
			//REMEMBER TO SET BOOLEANS TO THEMSELVES INSTEAD OF ACCIDENTALLY SETTING THEM TO OPPOSITE VALUE
		}
		//code below is alright (for now, will need to edit oddReturn)
		else {
			if(nonSmallMoveDirection = true) {
				if(smallMove = true) {
					return recursiveTowers_2(disks, tower_1, tower_2, tempone, smallPosition, temptwo - 1, false, false, oddReturn);
				}
				else {
					return recursiveTowers_2(disks, tower_1, tower_2, tempone, smallPosition, temptwo - 1, false, true, oddReturn);
				}
			}
			else {
				if(smallMove = true) {
					return recursiveTowers_2(disks, tower_1, tower_2, tempone, smallPosition, temptwo - 1, true, false, oddReturn);
				}
				else {
					return recursiveTowers_2(disks, tower_1, tower_2, tempone, smallPosition, temptwo - 1, true, true, oddReturn);
				}
			}
		}
		
		//--System.out.println("Move the top disk from tower " +tower_1+ "to tower " +tower_2+ ".");
		//--return recursiveTowers_2(disks, tower_1, tower_2, tempone, smallPosition, temptwo, nonSmallMoveDirection, smallMove, oddReturn);
		
		//the return statements make it a recursive function
		//>>> recursive call, syso, recursive call <<<
	}
}

//rules of the game:
//1. the smallest disk moves left every other turn if the number of disks is odd, or
//   right if it's even.
//2. otherwise, the only other move involves moving the non-smallest disk left right left, etc.
//   if the number of disks is even, or right left right, etc. if it is odd.
//3. to do a tower with 5 disks, you need to do the tower with 4 disks, plus the 5th disk, then
//   the 4 disks again. To do 4 disks, you need to do the tower with 3 disks, plus the 4th disk,
//   then the 3 disks again.

//this code just states how many moves minimum are required to complete a TOH game with a set number of disks.
/*public int recursiveTowers(int disks) {
	//System.out.print("Least # of moves required: ");
	if(disks == 3) {
		//print instructions on how to do 3 disks
		return 7;
	}
	else {
		//print instructions for 3, then 4, 3, 5, 3, 4, 3, 6, etc.
		return recursiveTowers(disks - 1) + 1 + recursiveTowers(disks - 1);
	}
}*/