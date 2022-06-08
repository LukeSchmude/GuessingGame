public class inputValidation {
        public static boolean guessCheck(String playersGuess){

        boolean valid;
            try {
                System.out.println(Integer.parseInt(playersGuess));
                valid = true;

            }catch(Exception e){
                System.out.println("Please enter a number");
                valid = false;
            }

            return valid;
        }
}
