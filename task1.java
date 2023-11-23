import java.util.*; 
public class task1 {
 
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
 
        // Generate the numbers
        int number = 1 + (int)(100 * Math.random());
 
        // Given K trials
        int K = 5;
 
        int i, guess;
 
        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");
 
        // Iterate over K Trials
        for (i = 0; i < K; i++) {
 
            System.out.println("Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println("You have exhausted" + " K trials.");
 
            System.out.println("The number was " + number);
        }
    }
 
    // Driver Code
    public static void main(String arg[])
    {
        // Function Call
        guessingNumberGame();
    }
}

//Output:
/*A number is chosen between 1 to 100.Guess the number within 5 trials.
Guess the number:
55
The number is less than 55
Guess the number:
23
The number is less than 23
Guess the number:
11
The number is greater than 11
Guess the number:
15
The number is less than 15
Guess the number:
12
You have exhausted K trials.
The number was 13
*/