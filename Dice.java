import java.util.Scanner;

public class Dice {

	

	private int DiceTotal;
	private int Hi_Low_Mid;
	private String Guess;

	int points = 0 ; 
	
	Scanner input = new Scanner(System.in);
	// Constructor
	public Dice(int Dice, String UserGuess, int HiorLow ) 
	{

		switch (Dice)
		{
		case 1: DiceTotal = 1 + (int) (Math.random() * 6); break;
		case 2: DiceTotal = 2 + (int) (Math.random() * 6); break;
		case 3: DiceTotal = 3 + (int) (Math.random() * 6); break;
		}
		
		Guess = UserGuess;
		Hi_Low_Mid = HiorLow;
	
	}

	// will let user know if they guess to low,too high, or just right.
	public void Hi_and_Low() 
	{
		if (DiceTotal >= Hi_Low_Mid && Guess.equalsIgnoreCase("hi"))
		{
			System.out.println("your right");
			System.out.print("Dice Total: " + DiceTotal);
			points++;
		}
		else if (DiceTotal <= Hi_Low_Mid && Guess.equalsIgnoreCase("low"))
		{
			System.out.println("your right ");
			System.out.print("Dice Total: " + DiceTotal);
			points++;
		}
		else if (DiceTotal == Hi_Low_Mid && Guess.equalsIgnoreCase("mid"))
		{
			System.out.println("your right ");
			System.out.print("Dice Total: " + DiceTotal);
			points += 5;
		}
		else 
		{
			System.out.println("your wrong ");
			System.out.print("Dice Total: " + DiceTotal);
			points += -1;
		}
		
	}
	
	public int GetPoints() 
	{
		return points; // returns points 
	}

	// Output
	public void Output() 
	{
		System.out.println("\nyour guess: " + Guess);
		Hi_and_Low();

	}
}

	