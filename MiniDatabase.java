import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//Inventory tracker
public class MiniDatabase {
    public static void main(String[] args){
        //Uses an ArrayList<String> to store inventory items
        ArrayList<String> inventory = new ArrayList<>();
        Stack<String> changes = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println("Select the number of what you want to do: \n1)Add an item \n2)Remove an item " +
                    "\n3)Find an item \n4)View your inventory \n5)View your changes \n6)Quit");

            String choice = scanner.nextLine();

            //If the choice equals to 1, adds an item to the inventory that the user inputs.
            if(choice.equals("1")){
                System.out.println("Enter the name of the item you want to add: ");
                String item1 = scanner.nextLine();
                inventory.add(item1);
                changes.push("Added " + item1);
            }

            //If the choice equals to 2, removes an item that the user inputs.
            if(choice.equals("2")){
                System.out.println("Enter the name of the item you want to remove: ");
                String item2 = scanner.nextLine();
                inventory.remove(item2);
                changes.push("Removed " + item2);

            }

            //If the choice equals to 3, finds an item that the user inputs.
            if(choice.equals("3")){
                System.out.println("Enter the name of the item you want to find: ");
                String item3 = scanner.nextLine();
                if(inventory.contains(item3)){
                    System.out.println(item3 + " is in the inventory.");
                }
                else{
                    System.out.println(item3 + " sis not in the inventory.");
                }
            }

            //If the choice equals to 4, prints all the items in the inventory.
            if(choice.equals("4")){
                for (String item : inventory){
                    System.out.println(item);
                }
            }

            //If the choice equals to 5, displays the recent changes.
            if(choice.equals("5")){
                if(changes.isEmpty()){
                    System.out.println("There are no recent changes.");
                }
                else{
                    System.out.println("Recent changes: ");
                    for(int i = 0; i < changes.size(); i++){
                        System.out.println(changes.get(i));
                    }
                }
            }

            //If the choice equals to 6, quits the program.
            if(choice.equals("6")){
                running = false;
            }
        }
    }
}
