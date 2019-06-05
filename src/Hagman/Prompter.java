package Hagman;
import java.util.Scanner;


public class Prompter {
	private Game game;
	
	public Prompter(Game game) {
		this.game = game;
		
	}
	 public boolean promptForGuess() {
		 Scanner scanner = new Scanner(System.in);
		 boolean isHit = false;
		 boolean isAcceptable = false;
		 
		 
		 do {
			 
			 System.out.print("Enter a letter:  ");
			 String guessInput = scanner.nextLine();
			 //char guess = guessInput.charAt(0); // get the first character of string  is 0
			 
			 
			 try{
				 isHit =  game.applyGuess(guessInput);
				 isAcceptable = true;
				
			 }catch(IllegalArgumentException iae) {
			  System.out.printf("%s. Pelase try again. %n",
						 iae.getMessage());
			 
		 }
	     }while(!isAcceptable);
		  return isHit; 
		
		
		
	 
	 }
	 
	 public void displayProgress() {
		 System.out.printf("tou have %d tries left to solve:  %s%n",
				 game.getRemainingTries(),
				 game.getCurrentProgress());
	 }
	 public void displayOutcome() {
			if(game.isWon() == true) {
				System.out.printf("Congratulations you won with %d tries reaminig.%n",
						            game.getRemainingTries());
			}else {
				System.out.printf("Bummer the word was %s.  :( %n,",game.getAnswer());
			}
				
				
			    
				
			}
	 

}
