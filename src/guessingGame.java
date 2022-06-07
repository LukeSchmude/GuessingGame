import java.util.Scanner;

public class guessingGame {
    public static void main (String[] args){
            Scanner sc = new Scanner(System.in); // player guess

            int number = (int) (1 + 20 * Math.random());
            int gl = 6; //guesses left = gl
            int i, guess;

            System.out.println("Hello! What is your name?");

            try {
                String player = sc.nextLine();

            System.out.println("Well " + player + ", I am thinking of a number between 1 and 20." + "\n" + "Take a guess");

            for (i = 0; i < gl; i++) {
            System.out.println("Guess the number");

            guess = sc.nextInt();

            if (guess == number) {
                System.out.println(("Good job, ") + player + ("!") + (" You guessed my number in ") + gl + (" guesses!"));
                break;
            } else if (guess > number && i != gl - 1) {
                System.out.println("Your guess is too high.");
            } else if (guess < number && i != gl - 1) {
                System.out.println("Your guess is too low.");
            }

            }
            if (i == gl) {
            System.out.println("No more guesses \nYou lose.");
            System.out.println("The number was " + number);
        }
            }catch(Exception e){
                System.out.println("Please enter a number");
            }
    }
}
