import java.util.List;

public class Inventory<T extends Supplies> {

    private List<T> items;

    // Constructor
    public Inventory(List<T> items) {
        this.items = items;
    }

    // Getter and Setter for items
    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    // Method to search by name and return index or -1 if not found
    public int searchByName(List<T> inputList, String name) {
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Method to check quantity and update if needed
    public T checkQty(List<T> inputList, String name, int desiredQuantity) {
        int index = searchByName(inputList, name);
        if (index == -1) {
            return null; // Item not found
        }

        T item = inputList.get(index);
        if (item.getQuantity() == desiredQuantity) {
            System.out.println("The quantity matches the desired quantity.");
            return item;
        } else {
            item.setQuantity(desiredQuantity);
            System.out.println("The quantity has been updated to the desired quantity.");
            return item;
        }
    }
}