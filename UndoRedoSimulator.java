import java.util.Scanner;
import java.util.Stack;

public class UndoRedoSimulator {
    public static void main(String[] args) {
        //Creates the stacks.
        Stack<String> undo = new Stack<>();
        Stack<String> redo = new Stack<>();

        //Creates a scanner object.
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while(running) {

            //Prints the menu for the users.
            System.out.println("Select the number of what you want to do: \n1)Type a word/sentence \n2)Undo \n3)Redo \n4)Quit");

            //Reads the user's choice.
            String choice = scanner.nextLine();

            //If the choice equals to 1, the user is prompted to type a word/sentence.(push to undo stack)
            if (choice.equals("1")) {
                System.out.println("Enter your word/sentence: ");
                String text = scanner.nextLine();
                undo.push(text);
                redo.clear();
                System.out.println(undo);
            }

            //If the choice equals to 2, undo's the word/sentence, and displays the current text.
            // Pops the last text from undo and pushes it to redo.
            if (choice.equals("2")) {
                if (!undo.isEmpty()) {
                    String u = undo.pop();
                    redo.push(u);
                }
            }

            //If the choice equals to 3, redo's the word/sentence, and displays the current text. (pop from redo → push to undo)
            // Pops the last text from redo and pushes it to undo.
            // Erases when new text is added.

            if (choice.equals("3")) {
                if (!redo.isEmpty()) {
                    String r = redo.pop();
                    undo.push(r);
                }
            }

            //If the choice equals to 4, quits the program.
            if (choice.equals("4")) {
                running = false;
            }

            //Prints the current text stored in the undo stack.
            if (!undo.isEmpty()){
                System.out.println("Current text: ");
                for (String word : undo){
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            else{
                System.out.println("Current text: ");
            }

        }

    }
}
