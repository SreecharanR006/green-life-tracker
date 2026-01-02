import java.util.Scanner;

public class ConsoleUI {

    private Scanner sc = new Scanner(System.in);
    private ActionManager manager = new ActionManager();

    public void start() {
        banner();

        while (true) {
            printMenu();
            int choice = getIntInput("Choose option: ");

            switch (choice) {
                case 1 -> addAction();
                case 2 -> viewActions();
                case 3 -> showImpact();
                case 4 -> exit();
                default -> System.out.println("[ERROR] Invalid choice.");
            }
        }
    }

    private void banner() {
        System.out.println("""
        ======================================
              GREEN LIFE TRACKER
          Track actions. Measure impact.
             Live more sustainably.
        ======================================
        """);
    }

    private void printMenu() {
        System.out.println("""
        1. Add Eco Action
        2. View Actions
        3. View Total Impact
        4. Exit
        """);
    }

    private void addAction() {
        System.out.print("Action name: ");
        String name = sc.nextLine();

        String category;
        while (true) {
            System.out.print("Category (Water/Energy/Travel/Waste): ");
            category = sc.nextLine();
            if (category.matches("Water|Energy|Travel|Waste")) break;
            System.out.println("[ERROR] Invalid category.");
        }

        int score = getIntInput("Impact score (1-10): ");

        manager.addAction(new EcoAction(name, category, score));
        System.out.println("[OK] Eco action logged successfully.");
    }

    private void viewActions() {
        if (manager.getActions().isEmpty()) {
            System.out.println("[INFO] No eco actions logged yet.");
            return;
        }

        System.out.println("\n--- Logged Eco Actions ---");
        manager.getActions().forEach(a ->
            System.out.println(a.toDisplayString())
        );
    }

    private void showImpact() {
        System.out.println("\nTotal Eco Impact Score: "
                + manager.getTotalImpact());
    }

    private int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("[ERROR] Please enter a valid number.");
            }
        }
    }

    private void exit() {
        System.out.println("Thank you for choosing a greener life.");
        System.exit(0);
    }
}
