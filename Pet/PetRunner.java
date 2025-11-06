public class PetRunner {
    public static void main(String[] args) {
        VirtualPet dog = new VirtualPet("Bear");
        dog.feed();
        System.out.println(dog.toString());
        dog.feed();
        System.out.println(dog.toString());
        dog.play();
        System.out.println(dog.toString());
        dog.passTime();
        System.out.println(dog.toString());
    }
}    