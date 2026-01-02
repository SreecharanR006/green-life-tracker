public class EcoAction {
    private String name;
    private String category;
    private int impactScore;

    public EcoAction(String name, String category, int impactScore) {
        this.name = name;
        this.category = category;
        this.impactScore = impactScore;
    }

    public int getImpactScore() {
        return impactScore;
    }

    public String toFileString() {
        return name + "," + category + "," + impactScore;
    }

    public static EcoAction fromFileString(String line) {
        String[] parts = line.split(",");
        return new EcoAction(parts[0], parts[1], Integer.parseInt(parts[2]));
    }

    public String toDisplayString() {
        return String.format("🌱 %-20s | %-10s | Impact: %d",
                name, category, impactScore);
    }
}
