import java.util.LinkedHashSet;

public class UC5_PreserveInsertionOrder {

    public void execute() {

        System.out.println("\n======================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("======================================");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate intentionally
        train.add("Sleeper"); // ignored

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}