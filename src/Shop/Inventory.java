package Shop;
import java.util.*;

import Shop.Items;

public class Inventory {

//    default constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    ArrayList<Items> items;
    private static int totalItems = 0;


    public void addItem(Items item) {
        items.add(item);
        totalItems++;
    }

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
