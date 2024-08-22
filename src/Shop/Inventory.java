package Shop;
import java.util.*;

import Shop.Items;

// use of classes can be seen here
public class Inventory {
    ArrayList<Items> items;
//    use of a static member variable
    private static int totalItems = 0;


    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Items item) {
        items.add(item);
        totalItems++;
    }

//    use of a static member function
    public static int getTotalItems() {
        return totalItems;
    }

    public ArrayList<Items> getItems() {
        return items;
    }
    public Items getItemByName(String name) {
        for (Items item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void displayItems() {
        System.out.println("Inventory Items:");
        for (Items item : items) {
            item.displayInfo();
            System.out.println("--------------------");
        }
    }
}
