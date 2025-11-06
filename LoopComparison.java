//Loop comparison
class LoopComparison {
    public static void main(String[] args) {
        // First loop
        long start1 = System.nanoTime();
        int sum1 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum1 += Math.sqrt(i);
        }
        long end1 = System.nanoTime();

        // Second loop
        long start2 = System.nanoTime();
        int sum2 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum2 += i * i;
        }
        long end2 = System.nanoTime();

        System.out.println("Loop 1 time: " + (end1 - start1) + " ns");
        System.out.println("Loop 2 time: " + (end2 - start2) + " ns");
    }
}
