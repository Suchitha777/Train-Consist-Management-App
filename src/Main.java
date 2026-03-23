public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================");

        // UPDATED CLASS NAME HERE 👇
        UC1_InitializeTrain train = new UC1_InitializeTrain();
        train.displaySummary();
        UC2_AddPassengerBogies uc2 = new UC2_AddPassengerBogies();
        uc2.execute();
        UC3_UniqueBogieIDs uc3 = new UC3_UniqueBogieIDs();
        uc3.execute();
        UC4_OrderedBogieConsist uc4 = new UC4_OrderedBogieConsist();
        uc4.execute();
        UC5_PreserveInsertionOrder uc5 = new UC5_PreserveInsertionOrder();
        uc5.execute();

        System.out.println("\nSystem ready for operations...");
    }
}