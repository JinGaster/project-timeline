import java.util.Scanner;
import java.util.Random;
public class rpgGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
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
			System.out.println("* You're hungry. You go downstairs.");
		}
		else {
			System.out.println("* As punishment for typing incorrectly, you go downstairs, even though you don't want to.");
		}
		if(firstChoice.equalsIgnoreCase("GET BATTERIES")) {
			System.out.println("* You walk downstairs, and wonder what would've happened if you chose to stay and watch m e e m z.");
		}
		else {
			System.out.println("* You walk downstairs.");
		}
		
	}
}
