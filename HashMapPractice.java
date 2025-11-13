import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){
        //Replaces and index with any name you want (a[0] --> cindy)
        HashMap<String, Integer> grades = new HashMap<>();
        //Keys (the way you reference a value) must be unique
        grades.put("cindy", 90);
        System.out.println(grades.get("cindy"));
        grades.put("cindy", 80);
        System.out.println(grades.get("cindy"));
        grades.isEmpty();
        grades.containsKey("cindy");
        grades.putIfAbsent("cindy", 90);

        for(Map.Entry<String, Integer> item : grades.entrySet()){

        }
    }
}
