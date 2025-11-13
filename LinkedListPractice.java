import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args){
        //Creates a linked list to store tasks
        LinkedList<String> todo = new LinkedList<>();

        //Adds two tasks to the linked list (at the end)
        todo.add("Clean room");
        todo.add("Fold laundry");

        //Adds three tasks to the linked list (at the beginning)
        todo.addFirst("Study for bio quiz");
        todo.addFirst("Math homework");
        todo.addFirst("Sign form");

        //Adds the task "homework" at index 3
        todo.add(3, "homework");

        //Removes the third task by index
        todo.remove(2);

        //Removes the task "homework" by object
        todo.remove("homework");

        //Removes the last element of the list
        todo.removeLast();

        //Prints the final list
        System.out.println("To-do list: " + todo);

    }
}
