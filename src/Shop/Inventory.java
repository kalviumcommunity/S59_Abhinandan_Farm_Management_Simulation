package Shop;
import java.util.*;

import Shop.Items;

public class Inventory {
    ArrayList<Items> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Items item) {
        items.add(item);
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
