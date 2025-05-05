package week5;

public class Tailgater {
    private static int drinksInCooler;
    private static int numberOfTailgaters;
    private String name;
    private boolean isBingFan;
    private int drinks;
    
    public Tailgater(String name, boolean isBingFan) {
        this.name = name;
        this.isBingFan = isBingFan;
        numberOfTailgaters += 1;
        if (!isBingFan) {
            for (int i = 0; i < 20; i++) {
                System.out.println("Go Binghamton!");
            }
        }
    }
    public String getName() {
        return name;
    }
    public boolean isBingFan() {
        return isBingFan;
    }
    public void getDrinkFromCooler() {
        if (drinksInCooler > 0) {
            drinks += 1;
            drinksInCooler -= 1;
        }
    }
    public boolean isCoolerEmpty() {
        return drinksInCooler == 0;
    }
    public static void addDrinksToCooler(int drinks) {
        drinksInCooler += drinks;
    }
}