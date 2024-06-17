package Practise;

// Base class representing a Pizza
public class Pizza {
    private String base;
    private String[] toppings;

    // Constructor
    public Pizza(String base, String[] toppings) {
        this.base = base;
        this.toppings = toppings;
    }

    // Method to calculate the cost of the pizza
    public double calculateCost() {
        double baseCost = 0;
        double toppingCost = 0;

        // Calculate base cost
        if (base.equalsIgnoreCase("Standard")) {
            baseCost = 5.0;
        } else if (base.equalsIgnoreCase("Soft")) {
            baseCost = 6.0;
        }

        // Calculate topping cost
        for (String topping : toppings) {
            if (topping.equalsIgnoreCase("Tomato")) {
                toppingCost += 1.0;
            } else if (topping.equalsIgnoreCase("Corn")) {
                toppingCost += 1.5;
            } else if (topping.equalsIgnoreCase("Mushroom")) {
                toppingCost += 2.0;
            }
        }

        // Total cost
        return baseCost + toppingCost;
    }

    public static void main(String[] args) {
        // Create a pizza with a standard base and toppings
        Pizza pizza = new Pizza("Standard", new String[]{"Tomato", "Corn"});

        // Calculate and print the cost
        System.out.println("Cost of the pizza: $" + pizza.calculateCost());
    }
}
