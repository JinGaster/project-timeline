
public class TempTowers {
	private int smallPosition = 3;
	public void recursiveTowers_2(int disks, int tower_1, int tower_2, int temptwo, boolean nonSmallMoveDirection, boolean switchReturn) {
		//organizing room
		
		if(temptwo == 1) {
			tower_1 = smallPosition;
			if(disks % 2 == 1) {
				tower_2 = tower_1 - 1;
				smallPosition--;
				if(smallPosition < 1) {
					smallPosition = 3;
				}
			}
			else {
				tower_1 = smallPosition;
				tower_2 = tower_1 + 1;
				smallPosition++;
				if(smallPosition > 3) {
					smallPosition = 1;
				}
			}
			if(tower_2 > 3) {
				tower_2 = 1;
			}
			else if(tower_2 < 1) {
				tower_2 = 3;
			}
			if(tower_2 == smallPosition) {
				tower_2++;
				if(tower_2 > 3) {
					tower_2 = 1;
				}
			}
			System.out.println("Move the smallest disk to " +tower_2+ ".");
			//move the smallest disk to a place, at a different time(tm).
		}
		else {
			//this first part is what gives the syso command to move the new disk over to the new tower.
			//basically, it tells where the disk needs to go
			if(disks % 2 == 1) {
				if(temptwo % 2 == 1) {
					tower_2 = 3;
				}
				else {
					tower_2 = 2;
				}
			}
			else {
				if(temptwo % 2 == 0) {
					tower_2 = 3;
				}
				else {
					tower_2 = 2;
				}
			}
			//if(tower_2 == smallPosition) {
			//	tower_2++;
			//	if(tower_2 > 3) {
			//		tower_2 = 1;
			//	}
			//	//sdfsdf
			//}
			//this first part is what manages the disks before the new disk (i.e if the total number of disks is four, this handles
			//the three prior disks). basically, this is responsible for realistically moving the disk.
			if(nonSmallMoveDirection == true) {
				recursiveTowers_2(disks, tower_1, tower_2, temptwo - 1, false, switchReturn);
			}
			else {
				recursiveTowers_2(disks, tower_1, tower_2, temptwo - 1, true, switchReturn);
			}
			if(switchReturn == true) {
				System.out.println("Move the " +temptwo+ " disk to tower " +(tower_2 + 1)+ ".");
			}
			else {
				System.out.println("Move the " +temptwo+ " disk to tower " +tower_2+ ".");
			}
			
			
			//this third part is what manages the cleanup, where after moving the new disk, move the prior disks on top of that disk.
			//this is literally the exact same as the first section, so that's neat. :)
			if(switchReturn == false) {
				switchReturn = true;
			}
			else {
				switchReturn = false;
			}
			if(nonSmallMoveDirection == true) {
				recursiveTowers_2(disks, tower_1, tower_2, temptwo - 1, false, switchReturn);
			}
			else {
				recursiveTowers_2(disks, tower_1, tower_2, temptwo - 1, true, switchReturn);
			}
			//to do: first time move to 2nd tower, next time to the 3rd
		}

		//old code
		//temptwo = disks;
		//if(disks % 2 == 1) {
		//	oddReturn = true;
		//}
		//else {
		//	oddReturn = false;
		//}
		////third, second, third, etc.
		//if(oddReturn = true) {
		//	return recursiveTowers_2(disks, tower_1, tower_2 /*3*/, tempone, smallPosition, temptwo - 1, nonSmallMoveDirection, smallMove, false);
		//}
		//else {
		//	return recursiveTowers_2(disks, tower_1, tower_2 /*2*/, tempone, smallPosition, temptwo - 1, nonSmallMoveDirection, smallMove, true);
		//}
	}
}
