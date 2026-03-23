import java.util.HashSet;

public class UC3_UniqueBogieIDs {

    public void execute() {

        System.out.println("\n======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("======================================");

        // Create HashSet
        HashSet<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG104");
        bogieIds.add("BG103");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        bogieIds.add("BG101"); // duplicate

        // Display result
        System.out.println("\nBogie IDs After Insertion:");
        System.out.println(bogieIds);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}