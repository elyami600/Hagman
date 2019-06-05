package Hagman;

public class Hagman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("Usage: java Hangman <ansmwe>");
			System.out.println("answer is required");
			System.exit(1);
		}
		
		Game game = new Game("samana");             // call the contruction
		Prompter prompter = new Prompter(game);
		while(game.getRemainingTries() > 0 && !game.isWon()) {
			prompter.displayProgress();
			prompter.promptForGuess();
		}
		prompter.displayOutcome();
	}

}

/*
 * There are a few stories that were left in the backlog:
   1.As a prompter, I should know the name of the guesser so that things can appear more friendly.
   2.As a prompter, I should know the highest score, so that it can be used to encourage competition
 * */
 