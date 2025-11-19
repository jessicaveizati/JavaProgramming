import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        //Uses a HashMap<String, String> to store names and phone numbers.
        // The names are the keys and the numbers are the values.
        HashMap<String, Integer> phoneBook = new HashMap<>();

        //Creates a scanner object.
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while(running) {

            //Prints the menu for the users.
            System.out.println("Select the number of what you want to do: \n1)Add a new contact \n2)Look up contact " +
                    "\n3)Delete contact \n4)View all contacts \n5)Quit");

            //Reads the user's choice.
            String choice = scanner.nextLine();

            //If the choice equals 1, adds a new contact.
            if (choice.equals("1")) {
                System.out.println("Enter a name to add to the phone book: ");
                String name = scanner.nextLine();
                System.out.println("Enter " + name + "'s Number (no dashes): ");
                int num = scanner.nextInt();
                scanner.nextLine();
                phoneBook.put(name, num);
            }

            //If the choice equals 2, looks up a name in the phone book.
            //If the name is in the phone book, prints the person's phone number.
            if (choice.equals("2")){
                System.out.println("Enter a name to search in the phone book: ");
                String name1 = scanner.nextLine();
                if(phoneBook.containsKey(name1)){
//                    String num1 = String.valueOf(phoneBook.get(name1));
                    System.out.println(name1 + "'s number is: " + phoneBook.get(name1));
                } else {
                    System.out.println("That name is not in the phone book.");
                }
            }

            //If the choice equals 3, deletes a name from the phone book.
            if(choice.equals("3")){
                System.out.println("Enter a name to delete from the phone book: ");
                String name2 = scanner.nextLine();
                if(phoneBook.containsKey(name2)){
                    phoneBook.remove(name2);
                }
                else{
                    System.out.println("This name is not in the phone book.");
                }
            }

            //If the choice equals 4, prints out all the contacts.
            if(choice.equals("4")) {
                for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
                    System.out.println("Name: " + entry.getKey() + ", Number: " + entry.getValue());
                }
            }

            //If the choice equals 5, quits the program.
            if(choice.equals("5")){
                running = false;
            }

            }

    }
}
