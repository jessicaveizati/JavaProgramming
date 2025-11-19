class TrainCar {
    private String name;
    private TrainCar next;

    public TrainCar(String name) {
        this.name = name;
    }

    public void setNext(TrainCar next) { this.next = next; }
    public TrainCar getNext() { return next; }
    public String getName() { return name; }
}
public class TrainOfNodes {
    public static void main(String[] args) {

        //Creates a few TrainCar objects
        TrainCar car1 = new TrainCar("tc1");
        TrainCar car2 = new TrainCar("tc2");
        TrainCar car3 = new TrainCar("tc3");

        //Links them together manually using setNext().
        car1.setNext(car2);
        car2.setNext(car3);

        //Calls the print names method
        printNames(car1);

    }

    //Create a method to print all car names by traversing from the first node
    private static void printNames(TrainCar car){
        while(car !=null){
            System.out.println(car.getName());
            car = car.getNext();
        }
    }
}




