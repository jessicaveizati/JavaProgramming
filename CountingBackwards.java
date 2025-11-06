public class CountingBackwards{
    public static void main (String[] args){
        long start = System.nanoTime();

        int sum = 0;
        for (int i = 10_000_000; i >= 0; i--) {
            sum += i;
        }
        long end = System.nanoTime();
        System.out.println("Sum: " + Math.abs(sum));
        System.out.println("Time: " + (end - start) + "ns");
    }
}



