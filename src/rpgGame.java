import java.util.Scanner;
import java.util.Random;
public class rpgGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String[] inv = new String[10];
		int i = 0; //i is number of items in inv.
		int rpsComNum = rand.nextInt(3);
		String rpsComChoice = null;
		if(rpsComNum == 0) {
			rpsComChoice = "rock";
		}
		else if(rpsComNum == 1) {
			rpsComChoice = "paper";
		}
		else if(rpsComNum == 2) {
			rpsComChoice = "scissors";
		}
		System.out.println("O V E R R A T E D   R P G   G A M E");
		boolean bool1 = true;
		boolean optionBool = true;
		while(bool1 == true) {
			System.out.println("Type PLAY to play, OPTIONS for options, or EXIT to exit.");
			String titleOption = scan.next();
			if(titleOption.equalsIgnoreCase("PLAY")) {
				System.out.println("oKAY");
				bool1 = false;
			}
			else if(titleOption.equalsIgnoreCase("OPTIONS")) {
				while(optionBool) {
					System.out.println("O P T I O N S: ");
					System.out.println("go back to title screen - yes/no");
					String onlyOption = scan.next();
					if(onlyOption.equalsIgnoreCase("yes")) {
						System.out.println("ok");
						optionBool = false;
					}
					else if(onlyOption.equalsIgnoreCase("no")) {
						continue;
					}
					else {
						System.out.println("interpreting vague answer as no");
						continue;
					}
				}
				continue;
			}
			else if(titleOption.equalsIgnoreCase("EXIT")) {
				System.out.println("bye");
				System.exit(0);
			}
			else {
				System.out.println("yo that ain't valid bruh");
				continue;
			}
		}
		System.out.println("* This story starts out like any other, and in this case, watching m e m e s.");
		System.out.println("* You look inside your games closet. All you see is a rock paper scissors machine.");
		System.out.println("* It looks like it hasn't been used in a long time.");
		System.out.println("* you vs cpu. Choose rock, paper, or scissors.");
		String aaaaaaayouuu = scan.next();
		System.out.println("* Oh. The machine shut down. It's out of batteries.");
		System.out.println("* At least you know the computer chose "+rpsComChoice+", so I guess you can figure it out yourself.");
		System.out.println("* You think about going downstairs to get more batteries, but you also feel like watching more m e e m s.");
		System.out.println("* What do you do? [GET BATTEREIES] [MEMES]");
		String firstChoice = scan.next();
		if(firstChoice.equalsIgnoreCase("GET BATTERIES")) {
			System.out.println("* You decide to go downstairs.");
		}
		else if(firstChoice.equalsIgnoreCase("MEMES")) {
			System.out.println("* You're too tired to go downstairs anyway.");
			System.out.println("* You go back to your computer to watch memes.");
			System.out.println("* ...");
			System.out.println("* ...");
			System.out.println("* ...");
			System.out.println("* You're hungry. You go downstairs.");
		}
		else if(firstChoice.equalsIgnoreCase("TAKE BATTERIES")) {
			System.out.println("* You take the dead batteries from the machine. You probably don't need them anymore, but you decided to take them anyway.");
			System.out.println("* You got 2 (dead) E-Cell Batteries.");
			inv[i] = "Dead Batteries";
			i++;
			System.out.println("* You go downstairs.");
		}
		else {
			System.out.println("* As punishment for typing incorrectly, you go downstairs, even though you probably didn't want to.");
		}
		if(firstChoice.equalsIgnoreCase("GET BATTERIES")) {
			System.out.println("* You walk downstairs, and wonder what would've happened if you chose to stay and watch m e e m z.");
		}
		else {
			System.out.println("* You walk downstairs.");
		}
		System.out.println("* Your dog starts barking. He probably needs a walk.");
		System.out.println("* You take your dog for a walk. You don't really have a choice.");
		System.out.println("* Apparently, the one who made this is too lazy to put in an if statement for you to make a choice in the first place.");
		System.out.println("* You go outside.");
		System.out.println("* It's 3 in the morning.");
		System.out.println("* Before you go back inside, your dog opens up a rift in space and time and goes in.");
		System.out.println("* Oh well. Guess that sucks. You go back inside your house.");
		System.out.println("* You go to your kitchen, since you're (probably) hungry.");
		System.out.println("* You try to open the refrigerator.");
		System.out.println("* You miss.");
		System.out.println("* You try to open the refrigerator again. This time it opens. You get a drink.");
		System.out.println("* You miss. You get the cabbage.");
		System.out.println("* You try to put back the cabbage.");
		System.out.println("* You miss. It lands on the floor with a resounding thud.");
		System.out.println("* A feeling of guilt surrounds you. Oh well.");
		System.out.println("* You grab the box next to the fridge. You get...");
		System.out.println("* A   S T A L E   C R A C K E R .");
		System.out.println("* Stale Cracker has been added to your inventory.");
		inv[i] = "Stale Cracker";
		i++;
		System.out.println("* For a reason that would take way to long to think of, you decide to go outside.");
		System.out.println("* Among the hills, you see a cave. You grab your iron pickaxe and walk inside.");
		System.out.println("* To find diamonds, it's always recommended to dig straight down. So you do that.");
		System.out.println("* Uh oh. You're stuck.");
		System.out.println("* And, since the one who created this was forced by hogan luckins for the MC to fall into an ice cube with like a pond with a 2ft diameter, you do that.");
		System.out.println("[probably many years later]");
		System.out.println("P R O L O U G U E   C O M P L E T E");
		System.out.println("* Always remember that after a chapter is complete, type anything to go on to the next chapter.");
		String nextChapter = scan.next();
		System.out.println("Continuing to next chapter.");
		for(int c=0;c<10;c++) {
			System.out.println();
		}
		
	}
}
