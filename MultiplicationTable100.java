public class MultiplicationTable100{
    public static void main (String[] args){
        long start = System.nanoTime();

        int product = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++){
                product = i * j;
                System.out.println(product);
            }

        }
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) + " ns");
    }
}

