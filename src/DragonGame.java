
import java.util.Scanner;

public class DragonGame {

	public static void main(String[] args) {

		int state = 1;

		String name = "";

		Scanner scan1 = new Scanner(System.in);

		boolean play = true;
		while (play == true) {
			switch (state) {

			case 1:
				System.out.println("Please enter your name: ");
				name = scan1.nextLine();

				System.out.println("Welcome," + name);
				System.out.println("Would you like to play a game? Enter yes or no: ");

				String option = scan1.nextLine();

				if (option.equalsIgnoreCase("yes"))
					state = 2;
				else
					play = false;
				break;

			case 2:
				System.out
						.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! "
								+ " What would you do?  Enter 2 to face the beast.  Enter 3 to RUN AWAY :  ");
				int input = scan1.nextInt();
				if (input == 2) {

					System.out.println("face the beast.");
					state = 3;
				} else
					play = false;
				break;

			case 3:
				System.out.println(
						"You approach the dragon. How many heads does your dragon have? " + "Enter 1, 2, or 3:  ");
				input = scan1.nextInt();

				if (input == 1) {
					System.out.println("The one headed dragon is so scary!");
					state = 4;
				} else if (input == 2) {
					System.out.println("The two headed dragon is ugly!");
					state = 4;
				} else if (input == 3) {
					System.out.println("Noone has ever faced a 3-headed dragon before!");
					state = 4;
				} else
					play = false;
				break;

			case 4:
				System.out.println("Choose your weapon, soldier! Enter Slingshot, sword, or bow and arrow:  ");
				// clear out the input stream because its an integer type; to
				// prepare for string type
				scan1.nextLine();

				option = scan1.nextLine();

				if (option.equalsIgnoreCase("slingshot")) {
					System.out.println("Armed with your Slingshot, you approach the dragon!");
					state = 5;
				} 
				else if (option.equalsIgnoreCase("Sword")) {
					System.out.println("Armed with your Sword, you approach the dragon!");
					state = 5;
				} 
				else if (option.equalsIgnoreCase("bow and arrow")) {
					System.out.println("Armed with your bow and arrow, you approack the dragon!");
					state = 5;
				} 
				else
					play = false;
				break;

			case 5:
				System.out.println(
						"You can feel its fiery breath as you get closer. Tell me, Soldier, what color are it's eyes?! Enter Red or Blue: ");
				option = scan1.nextLine();
				if (option.equalsIgnoreCase("Red")) {
					System.out.println("It stares at you with it's scary red eyes!");
					System.out.println("Oh thank goodness!  Red-eyed dragons are super friendly!");
					state = 6;
				} 
				else if (option.equalsIgnoreCase("Blue")) {
					System.out.println("It stares at you with it's beautiful blue eyes!");
					System.out.println("Oh thank goodness!  Blue-eyed dragons are super friendly!");
					state = 6;
				} 
				else
					play = false;
				break;

			case 6:
				System.out.println("You pet the dragon and become best friends.  What will you name your pet dragon? Enter a name: ");
				option = scan1.nextLine();
				System.out.println(option + " and " + name +  " live happily ever after!");
				play = false;
				break;

			}
		}

	}

}
