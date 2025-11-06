public class ArrayPractice {
    public static void main (String[] args){
        //Declaration
        String[] names;

        //Instantiate
        int[] ages = new int[5];
        ages[1] = 10;
        ages[2] = 12;
        System.out.println(ages[1]);

        boolean[] a = new boolean[3];
        System.out.println(a[0]);

        //Length
        System.out.println(ages.length);

        //Instantiate and populate
        String[] colors = {"red", "orange", "yellow"};

        double[] temperatures = {89.2, 60.4, 75.2, 56.0, 67.67, 90.1, 23.5};
        double sum = 0.0;
        double max = 0.0;
        double min = 0.0;
        for (int i = 0; i < temperatures.length; i++){
            System.out.println(temperatures[i]);
            sum += temperatures[i];
            max = temperatures[i];
            min = temperatures[i];
            if (temperatures[i] > max){
                max = temperatures[i];
            }

            if(temperatures[i] < min){
                min = temperatures[i];
            }
        }
        double avg = sum/temperatures.length;
        System.out.println("The maximum temperature is: " + max);
        System.out.println("The minimum temperature is: " + min);

        //storage space
        //insert time
        //access (search) time
        //sorting time
        //int[][]grid = new int[3][3];

        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //accessing
        System.out.println(grid[0][2]);
        
        //change
        grid[0][2] = 99;
    }
}
