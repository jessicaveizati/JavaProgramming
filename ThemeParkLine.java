import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ThemeParkLine {
    public static void main(String[] args) {
        //Uses a Queue<String> (via LinkedList) to represent people waiting for a ride.
        Queue<String> line = new LinkedList<>();

        //Creates a scanner object.
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while(running) {

            //Prints the menu for the users.
            System.out.println("Select the number of what you want to do: \n1)Add name \n2)Remove next person \n3)View line \n4)Quit");

            //Reads the user's choice.
            String choice = scanner.nextLine();

            //If the choice equals to 1, adds a new person
            if (choice.equals("1")) {
                System.out.println("Enter the name you want to add: ");
                String person = scanner.nextLine();
                line.add(person);
            }

            //If the choice equals to 2, removes the first person in a queue
            if (choice.equals("2")) {
                line.remove();
            }

            //If the choice equals to 3, prints the entire queue
            if (choice.equals("3")) {
                for (String name : line) {
                    System.out.println(name);
                }
            }

            //If the choice equals to 4, quits the program.
            if(choice.equals("4")){
                running = false;
            }


        }

    }
}
