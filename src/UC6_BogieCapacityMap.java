import java.util.HashMap;
import java.util.Map;

public class UC6_BogieCapacityMap {

    public void execute() {

        System.out.println("\n======================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("======================================");

        // Create HashMap
        HashMap<String, Integer> bogieMap = new HashMap<>();

        // Add bogie-capacity mapping
        bogieMap.put("First Class", 24);
        bogieMap.put("Cargo", 120);
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 56);

        // Display details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}