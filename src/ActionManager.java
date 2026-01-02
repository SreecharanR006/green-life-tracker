import java.io.*;
import java.util.*;

public class ActionManager {
    private List<EcoAction> actions = new ArrayList<>();
    private final String FILE_NAME = "actions.txt";

    public ActionManager() {
        load();
    }

    public void addAction(EcoAction action) {
        actions.add(action);
        save();
    }

    public List<EcoAction> getActions() {
        return actions;
    }

    public int getTotalImpact() {
        return actions.stream()
                      .mapToInt(EcoAction::getImpactScore)
                      .sum();
    }

    private void save() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (EcoAction a : actions) {
                pw.println(a.toFileString());
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error saving data.");
        }
    }

    private void load() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                actions.add(EcoAction.fromFileString(sc.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("⚠️ Error loading data.");
        }
    }
}
