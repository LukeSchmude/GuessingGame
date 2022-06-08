import java.util.Scanner;

public class guessingGame {
    public static void main (String[] args){

        // USER INPUT OBJECT
        Scanner sc = new Scanner(System.in);
        String player = sc.nextLine();

        // CREATING RANDOM OUTCOME 1 TO 20
        int number = (int) (1 + 20 * Math.random());

        // GUESSES REMAINING
        int gl = 6;

        System.out.println("Hello! What is your name?");

        //KEEP ASKING USER FOR VALID RESPONSE
        boolean valid = false;
        String string_input = "";
        while(!valid){
            System.out.println("Please enter a number");
            string_input = sc.nextLine();
            valid = inputValidation.guessCheck(string_input);
        }

        int i;

        for (i = 0; i < gl; i++) {
            System.out.println("Guess the number");

        int playersGuess = Integer.parseInt(string_input);

        System.out.println("Well " + player + ", I am thinking of a number between 1 and 20." +
                "\n" + "Take a guess");

        if (playersGuess == number) {
            System.out.println(("Good job, ") + player + ("!") + (" You guessed my number in ") +
                    gl + (" guesses!"));
        } else if (playersGuess > number && i != gl - 1) {
            System.out.println("Your guess is too high.");
        } else if (playersGuess < number && i != gl - 1) {
            System.out.println("Your guess is too low.");
        }

    }
        if (i == gl) {
            System.out.println("No more guesses \nYou lose.");
            System.out.println("The number was " + number);
    }
    }
}
