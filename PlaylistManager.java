import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistManager {
    public static void main(String[] args) {
        //Uses an ArrayList<String> to store song titles
        ArrayList<String> songTitles = new ArrayList<>();

        //Creates a scanner object.
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while(running) {

            //Prints the menu for the users.
            System.out.println("Select the number of what you want to do: \n1)Add song \n2)Remove song \n3)View playlist \n4)Quit");

            //Reads the user's choice.
            String choice = scanner.nextLine();

            //If the choice equals to 1, adds a new song that the user inputs and prints the playlist.
            if (choice.equals("1")) {
                System.out.println("Enter the song you want to add: ");
                String song1 = scanner.nextLine();
                songTitles.add(song1);
                System.out.println("Your song has been added! Here is your new playlist: ");
                printList(songTitles);
            }

            //If the choice equals to 2, removes a song and prints the playlist.
            if (choice.equals("2")) {
                System.out.println("Enter the song you want to remove: ");
                String song2 = scanner.nextLine();
                songTitles.remove(song2);
                System.out.println("Your song has been removed! Here is your new playlist: ");
                printList(songTitles);

            }

            //If the choice equals to 3, prints the playlist.
            if (choice.equals("3")) {
                System.out.println("Playlist: ");
                printList(songTitles);
            }

            //If the choice equals to 4, quits the program.
            if (choice.equals("4")) {
                running = false;
            }

        }
    }

    private static void printList(ArrayList<String> songTitles) {
        for (int i = 0; i < songTitles.size(); i++) {
            System.out.println(songTitles.get(i));
        }
    }
}
