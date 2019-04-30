package day19__Loops;
import java.util.*;
public class GuessANumber {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int secretNumber = random.nextInt(101);
    System.out.println("Enter your guess:");
    int guess = scan.nextInt();
    int count = 1;
    do {
        count++;
        if (guess<secretNumber)
            System.out.println("Your number is too low, try again");
        else if (guess>secretNumber)
            System.out.println("Your number is too big, try again");
        guess = scan.nextInt();

    } while (guess!=secretNumber);
    System.out.println("Bingo!");
    System.out.println("You guessed it from " + count + " tries");

}
}