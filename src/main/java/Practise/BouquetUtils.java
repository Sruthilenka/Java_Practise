package Practise;

public class BouquetUtils {

    // Private constructor to prevent instantiation
    private BouquetUtils() {
        throw new AssertionError("Utility class BouquetUtils cannot be instantiated");
    }

    // Static method to calculate the cost of a bouquet
    public static int calculateCost(String[] flowers) {
        int totalCost = 0;
        for (String flower : flowers) {
            // Check the type of flower and increment totalCost accordingly
            if (flower.equalsIgnoreCase("Rose")) {
                totalCost += 15;
            } else if (flower.equalsIgnoreCase("Jasmine")) {
                totalCost += 2;
            } else if (flower.equalsIgnoreCase("Lily")) {
                totalCost += 3;
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
        // Example usage of the utility method
        String[] bouquet = {"Rose", "Rose", "Jasmine"};
        int cost = BouquetUtils.calculateCost(bouquet);
        System.out.println("Total cost of the bouquet: $" + cost);
    }
}
