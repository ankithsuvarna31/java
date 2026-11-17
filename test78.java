import java.util.HashMap;

public class test78 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(101, 85);
        map.put(102, 90);
        map.put(103, 75);
        map.put(104, 90);

        // Get marks of student 102
        System.out.println("Marks of student 102: " + map.get(102));

        // Check whether student 103 exists
        System.out.println("Student 103 exists: " + map.containsKey(103));

        // Update marks of student 101
        map.put(101, 95);

        // Remove student 104
        map.remove(104);

        // Print updated map
        System.out.println("Final Map: " + map);
    }
}






