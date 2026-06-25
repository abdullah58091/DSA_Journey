import java.util.HashMap;

public class basic {


    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Insert
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);

        // Print
        System.out.println("HashMap: " + map);

        // Get Value
        System.out.println("Apple: " + map.get("Apple"));

        // Check Key
        System.out.println("Contains Banana? " + map.containsKey("Banana"));

        // Remove
        map.remove("Banana");

        // Iterate
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Size
        System.out.println("Size: " + map.size());
    }
}
