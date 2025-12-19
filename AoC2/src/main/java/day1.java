import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1 {

    //Sets up the file and the scanner, then starts the program.
    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("/Users/jessicaveizati/Java-Programming/AoC2/src/main/java/numbers.txt");
        Scanner input = new Scanner(data);
        countZeros(input);
        }


    //Tracks the rotations and counts the amount of times the dial is on 0.
    public static void countZeros(Scanner input){
        int counter = 0; //How many times the dial is on 0
        int dial = 50; //The starting/current position of the dial
        String line = "";
        String direction;
        int num;

        //While there is a next line...
        while(input.hasNextLine()){
            line = input.nextLine();
            direction = line.substring(0,1); //Finds the direction (using L or R)
            num = Integer.parseInt(line.substring(1));

            //Updates the dial number.
            if (direction.equals("R")) {
                dial += num;
            } else if (direction.equals("L")) {
                dial -= num;
            }

            //Makes sure the dial value stays between 0-99.
            dial = dial % 100;
            if (dial < 0) {
                dial += 100;
            }

            //Makes sure the dial value is positive.
            if (dial == 0) {
                counter++;
            }
        }

        //Prints the final amout of times the dial was on 0.
        System.out.println(counter);
    }
}



