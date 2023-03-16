import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball<randNumber> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;

        if (play) {

            System.out.println("Enter question");
            String userQuestion = scanner.nextLine();

            int randNumber = new Random().nextInt(4);

            if (randNumber == 0) {
                System.out.println("Yes");
            }

            if (randNumber == 1) {
                System.out.println("No");
            }

            if (randNumber == 2) {
                System.out.println("Maybe");
            }

            if (randNumber == 3) {
                System.out.println("▼・ᴥ・▼ < woof");
            }

        }
    }

}


