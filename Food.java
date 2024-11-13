public class Food extends Supplies {

    // Instance variables
    private boolean perishable;

    // Default constructor
    public Food() {
        super();
        this.setPerishable(true);
    }

    // Full constructor
    public Food(String name, int quantity, boolean perishable) {
        super(name, quantity);
        this.setPerishable(perishable);
    }

    // Setters and Getters
    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    public boolean getPerishable() {
        return perishable;
    }

    // toString method
    public String toString() {
        return "FOOD: " + this.getName() + ", PRSHBL: " + this.perishable + ", QTY: " + this.getQuantity();
    }
}