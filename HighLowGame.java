import java.util.Scanner;
public class HighLowGame {

	public static void main(String[]args){
		
		
		String UserGuess;
		int Dice;
		int GameNum = 1;
		int points = 0;
		int MiddleDice = 0;
		String PlayAgain;
		boolean PlayGame = true;
		
		
		Scanner input = new Scanner(System.in);// allows input from user
		
	
		System.out.println("out of 3..how many dices would you like to play with?: ");
		Dice = input.nextInt();

		do {
			// Based off of dice it will call upon one of 3 if statements
			if (Dice == 1 || Dice == 2 || Dice == 3)
			{

				System.out.println("high or low or mid?");
				UserGuess = input.next();
				
				if (Dice == 1)
				{
					MiddleDice = 3;
				}
				if (Dice == 2)
				{
					MiddleDice = 6;
				}
				if (Dice == 3)
				{
					MiddleDice = 9;
				}

				Dice Dice1 = new Dice (Dice, UserGuess, MiddleDice); // calls oneDice class and gives it values to work with
				Dice1.Output(); // calls the output
				points += Dice1.GetPoints();
				

			} 
			
			else 
			{
				System.out.println("either 1,2, or 3, dices...no more..no less..");
			}

			System.out.println("\n play/try again?? (y/n)");
			PlayAgain = input.next();

			if (PlayAgain.equals("y")) {
				GameNum++; // counts times played and decides to play again or not
			} else {
				System.out.println("\n ok, goodbye..");
				System.out.println("times played:" + GameNum);
				System.out.println("\n points:" + points);
				PlayGame = false; // sets the boolean ( playing game ) to false therefore ending it
			}
		} while (PlayGame == true);// if ( playingGame ) is still true.. it will keep playing
	
}//ends Main

} //ends HighLowGame Class