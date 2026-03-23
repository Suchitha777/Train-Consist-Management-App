import java.util.ArrayList;
import java.util.List;

public class UC1_InitializeTrain {

    // List to store bogies
    private List<String> bogies;

    // Constructor → initialize train
    public UC1_InitializeTrain() {
        bogies = new ArrayList<>();
        System.out.println("\nTrain initialized successfully...");
    }

    // Method to display summary
    public void displaySummary() {
        System.out.println("Initial Bogie Count : " + bogies.size());
        System.out.println("Current Train Consist : " + bogies);
    }
}