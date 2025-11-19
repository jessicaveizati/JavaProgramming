import java.util.Scanner;
public class HighScoreTracker {
    public static void main(String[] args) {

        //Stores 10 player scores in an int[] array.
        int[] playerScores = {43, 68, 70, 24, 55, 9, 13, 82, 46, 31};

        //Defines the variables for the highest score and sum.
        int max = 0;
        int sum = 0;

        //Iterates through the playerScores array, calculates the highest score and sum.
        for (int i = 0; i < playerScores.length; i++) {
            if (playerScores[i] > max){
                max = playerScores[i];
            }
            sum += playerScores[i];
        }

        //Creates a scanner object.
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while(running) {
            //Prints the menu for the users.
            System.out.println("Select the number of what you want to do: \n1)Print all scores \n2)Print highest score " +
                    "\n3)Print average score \n4)Enter a new score \n5)Quit");

            //Reads the user's choice.
            String choice = scanner.nextLine();

            //If the choice equals to 1, prints out all the scores.
            if (choice.equals("1")) {
                for (int i = 0; i < playerScores.length; i++) {
                    System.out.println(playerScores[i]);
                }
            }

            //If the choice is equal to 2, prints out the highest score.
            if (choice.equals("2")) {
                System.out.println("The highest score is: " + max);
            }

            //If the choice is equal to 3, calculates and prints the average of the scores.
            if (choice.equals("3")) {
                int avg = sum / playerScores.length;
                System.out.println("The average score is: " + avg);
            }

            //If the choice is equal to 4, lets the user enter a new score and replaces
            //the lowest one if the new score is higher.
            if (choice.equals("4")) {

                replaceScore(scanner, playerScores);
            }

            if (choice.equals("5")) {
                running = false;
            }

        }

    }

    private static void replaceScore(Scanner scanner, int[] playerScores) {
        //Reads the user's input.
        System.out.println("Enter the score: ");
        int score = scanner.nextInt();

        //Defines variables for the lowest score and index for that score.
        int min = playerScores[0];
        int minIndex = 0;

        //Iterates through the playerScores array, finds the lowest score and it's index.
        for (int i = 1; i < playerScores.length; i++) {
            if (playerScores[i] < min) {
                min = playerScores[i];
                minIndex = i;
            }
        }

        //Replaces the lowest score if the new score is higher.
        if (score > min) {
            playerScores[minIndex] = score;
        }

        //Prints the updated list.
        System.out.println("Here is your updated list with the new score: ");
        for (int i = 0; i < playerScores.length; i++) {
            System.out.println(playerScores[i]);
        }
    }
}
