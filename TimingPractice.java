public class TimingPractice {
    public static void main(String[] args){
       //Measure how long it takes to run
        long start = System.nanoTime(); // current time in nanoseconds
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) + " ns");

    }

    //Timing a loop
    private static class LoopTimerExample {
        public static void main(String[] args) {
            long start = System.currentTimeMillis();

            int sum = 0;
            for (int i = 0; i < 1000000000; i++) {
                sum += i;
            }

            long end = System.currentTimeMillis();
            System.out.println("Sum: " + sum);
            System.out.println("Time: " + (end - start) + " ms");
        }
    }

}

