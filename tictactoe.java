import java.util.Scanner;

public class tictactoe 
{
public static void main( String[] args )
{
	Scanner userInput = new Scanner( System.in );
	//Player1Nmae spelare X namn
	//Player2Nmae spelare O namn
	String player1Name;
	String player2Name;
	
	
	System.out.println("Spelare X skriv dit namn: ");
	player1Name = userInput.next();
	
	System.out.println("Spelare O skriv dit namn: ");
	player2Name = userInput.next();
	
	
	System.out.println(player1Name+(" ")+player2Name);
	}
}