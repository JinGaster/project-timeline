import java.util.Scanner;
import java.util.Random;
public class rpgGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// text-based rpg! unfinished though...
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String[] inv = new String[10];
		int i = 0; //i is number of items in inv.
		int HP = 90;
		//put all preps behind
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
		System.out.println("* What do you do? [BATTERIES] [MEMES]");
		String firstChoice = scan.next();
		if(firstChoice.equalsIgnoreCase("BATTERIES")) {
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
		else if(firstChoice.equalsIgnoreCase("TAKE_BATTERIES")) {
			System.out.println("* You take the dead batteries from the machine. You probably don't need them anymore, but you decided to take them anyway.");
			System.out.println("* (You got 2 (dead) E-Cell Batteries.)");
			inv[i] = "Dead Batteries";
			i++;
			System.out.println("* You go downstairs.");
		}
		else {
			System.out.println("* As punishment for typing incorrectly, you go downstairs, even though you probably didn't want to.");
		}
		if(firstChoice.equalsIgnoreCase("BATTERIES")) {
			System.out.println("* You walk downstairs, and wonder what would've happened if you chose to stay and watch m e e m z.");
		}
		else {
			System.out.println("* You walk downstairs.");
		}
		System.out.println("* Your dog starts barking. He probably needs a walk.");
		System.out.println("* Instead of going downstairs for the initial reason that you were thinking of anyway, you take your dog for a walk.");
		System.out.println("* You don't really have a choice, anyway.");
		System.out.println("* Apparently, the one who made this is too lazy to put in an if statement for you to make a choice in the first place.");

		System.out.println("* Always remember that after a long segment of text, it may prompt you to type anything to go on.");
		String nextSection1c1 = scan.next();
		System.out.println("Continuing to next section.");

		System.out.println("* You go outside.");
		System.out.println("* It's 3 in the morning.");
		System.out.println("* Before you go back inside, your dog opens up a rift in space and time and goes in.");
		System.out.println("* Oh well. Guess that sucks. You go back inside your house.");
		System.out.println("* You go to your kitchen, since you're (probably) hungry.");

		System.out.println("* Type something to continue.");
		String nextSection2c1 = scan.next();
		System.out.println("Continuing to next section.");

		System.out.println("* You try to open the refrigerator.");
		System.out.println("* You miss.");
		System.out.println("* You try to open the refrigerator again. This time it opens. You get a drink.");
		System.out.println("* You miss. You get the cabbage.");
		System.out.println("* You try to put back the cabbage.");
		System.out.println("* You miss. It lands on the floor with a resounding thud.");
		System.out.println("* A feeling of guilt surrounds you. Oh well.");
		System.out.println("* You grab the box next to the fridge. You get...");
		System.out.println("* A   S T A L E   C R A C K E R .");
		System.out.println("* (Stale Cracker has been added to your inventory!)");
		inv[i] = "Stale Cracker";
		i++;
		System.out.println("* For a reason that would take way to long to think of, you decide to go outside.");

		System.out.println("* Type something to continue.");
		String nextSection3c1 = scan.next();
		System.out.println("Continuing to next section.");

		System.out.println("* Among the hills, you see a cave. You grab your iron pickaxe and walk inside.");
		inv[i] = "Iron Pickaxe";
		i++;
		System.out.println("* To find diamonds, it's always recommended to dig straight down. So you do that.");
		System.out.println("* Uh oh. You're stuck.");
		System.out.println("* And, since the one who created this was forced by hogan buckins for the MC to fall into an ice cube with like a pond with a 2ft diameter, you do that.");
		System.out.println("P R O L O U G U E   C O M P L E T E");

		System.out.println("* Type something to continue.");
		String nextc2 = scan.next();
		System.out.println("Continuing to next chapter.");

		for(int c=0;c<10;c++) {
			System.out.println();
		}
		System.out.println("[probably many years later]");
		System.out.println("* You open your eyes. You see someone. You don't know who he is because he is someone.");
		System.out.println("* You try to make conversation. What should you say? (* Use the number.)");
		System.out.println("[Who are you!?](1) [Just 5 more minutes?](2)");
		int interaction1 = scan.nextInt();
		while(true) {
			if(interaction1 == 1) {
				int convoStart1 = rand.nextInt(2);
				if(convoStart1 == 0) {
					System.out.println("* He yells back 'Who are you!?'. This goes on for several hours before you two are both exhausted. You both introduce yourselves.");
				}
				if(convoStart1 == 1) {
					System.out.println("* He introduces himself as 'Logan'. You introduce yourself as well. That was easy.");
				}
			}
			else if(interaction1 == 2) {
				int convoStart2 = rand.nextInt(2);
				if(convoStart2 == 0) {
					System.out.println("* Whoever that someone is, they're kinda mean, because he/she just slapped you and said 'Y O U   I M B E C I L E'");
					System.out.println("* Ow. That hurt. You lose 1 HP.");
					HP--;
					if(HP <= 0) {
						System.out.println("game over. also how do you die from that lol");
						System.exit(0);
					}
					System.out.println("* It all kinda worked out, since you both introduced yourselves.");
				}
				else if(convoStart2 == 1) {
					System.out.println("* Your vision clears and you see some guy making the neutral face of displeasure, and says, 'bruh seriously'");
					System.out.println("* You're confused. Oh well. You both introduce yourselves.");
				}
			} else {
				System.out.println("* Invalid. Remember to use the number!");
				continue;
			}
			break;
		}
		System.out.println("* Anyways, after that introduction, you decide to sit down and talk.");
		while(true) {
			System.out.println("[Where are we?](1) [How did you get here?](2)");
			int convoBody1 = scan.nextInt();
			if(convoBody1 == 1) {
				System.out.println("* Even though you know that this is a cave, you ask where you are.");
				System.out.println("* So apparently, you're in a cave.");
			}
			else if(convoBody1 == 2) {
				System.out.println("* He says he doesn't remember. He thinks that perhaps a rock hit his head and fell into a hole. That's odd.");
			}
			else {
				System.out.println("* Invalid. Remember to use the number!");
				continue;
			}
			System.out.println("* You feel like you should ask the other question if you haven't already. Would you like to do so? [yes/no]");
			String otherQuestion1 = scan.next();
			if(otherQuestion1.equalsIgnoreCase("Yes")) {
				continue;
			}
			else if(otherQuestion1.equalsIgnoreCase("No")) {
				break;
			}
			else {
				System.out.println("* Interpreting vague answer as 'yes'.");
				continue;
			}
		}
		System.out.println("* After a little bit, you decide to try and go outside.");
		System.out.println("* Oh wait. You're in a cave. You can't.");
		//		int methodOut;
		while(true) {
			System.out.println("Which method would you like to try?");
			System.out.println("[UP](1) [FORWARD](2)");
			int methodOut = scan.nextInt();
			if(methodOut == 1) {
				System.out.println("* You start digging up.");
			}
			else if(methodOut == 2) {
				System.out.println("* You start digging forward.");
			}
			else {
				System.out.println("* Invalid. Remember to use the number!");
				continue;
			}
			System.out.println("[Logan has left the game.] (frick you Java, I'm going back to Python -hogan)");
			System.out.println("...");
			System.out.println("...");
			System.out.println("...");
			System.out.println("[Logan has joined the game.]");
			System.out.println("* Oh dear. There's a bug in the character model, so now he looks like a dark shadow with no color.");
			System.out.println("* Eh, it'll probably fix later.");
			if(methodOut == 1) {
				System.out.println("* You tell Logan about how you are planning to dig upwards. He agrees.");
				System.out.println("* Both of you agree that you should stick together.");
				inv[i] = null;
				i--;
				System.out.println("* You lost your pickaxe somehow, so you'll have to think of another way out.");
				System.out.println("* There are some materials lying around, so that's nice. Some stalagtites fall onto the floor, and there's a...");
				System.out.println("* perfectly fine,");
				System.out.println("* totally reasonable,");
				System.out.println("* 100% not fake,");
				while(true) {
					System.out.println("* ....pile of nails. What do you create?");
					System.out.println("[MAKESHIFT LADDER](1) [ICE PICK](2)");
					int c2Tool = scan.nextInt();
					if(c2Tool == 1) {
						System.out.println("* You create a makeshift ladder.");
						
					}
					else if(c2Tool == 2) {
						System.out.println("* You create an ice pick.");
						
					}
					else {
						System.out.println("* Invalid. Remember to use the number!");
						continue;
					}
				}

			}
			else if(methodOut == 2) {
				System.out.println("* You tell Logan about how you are planning to dig forward. He doesn't seem to like it.");
				System.out.println("* Logan prefers to dig upwards, and you both go different ways.");
				inv[i] = null;
				i--;
				System.out.println("* You lost your pickaxe somehow, so you'll have to think of another way out.");
				System.out.println("* There are some materials lying around, so that's nice. Some ice cubes fall onto the floor, and there's a...");
				System.out.println("* perfectly fine,");
				System.out.println("* totally reasonable,");
				System.out.println("* 100% not fake,");
				while(true) {
					System.out.println("* ....pile of batteries. What do you create?");
					System.out.println("[MAKESHIFT DRILL](1) [ELECTRIC PICK](2)"); //unfinished
					int c2Tool = scan.nextInt();
					if(c2Tool == 1) {
						System.out.println("* You create a makeshift drill.");
						
					}
					else if(c2Tool == 2) {
						System.out.println("* You create an electric pick.");
						
					}
					else {
						System.out.println("* Invalid. Remember to use the number!");
						continue;
					}
				}
			}
			break;
		}
	}
}
