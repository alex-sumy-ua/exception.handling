package org.example.warehouse;

import org.example.warehouse.exceptions.DoubleItemException;
import org.example.warehouse.exceptions.NegativePriceException;
import org.example.warehouse.exceptions.OutOfStockException;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    private final Map<String, Integer> inventory = new HashMap<>();
    private static int counter = 0;

    public InventoryManager() {}

    public int getCounter() {
        return counter;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public boolean addItem(String name, int price) {
        if (price < 0) throw new NegativePriceException
                ("Price can't be negative.");
        if (inventory.containsKey(name)) throw new DoubleItemException
                ("\nThere is such an item in the inventory already.\nYou can't add it twice, sorry.");
        boolean result = false;
        inventory.put(name, price);
        counter++;
        result = true;
        return result;
    }

    public boolean removeItem(String name) {
        if (!inventory.containsKey(name)) throw new OutOfStockException
                ("There is no such an item in the inventory.");
        boolean result = false;
        inventory.remove(name);
        counter--;
        result = true;
        return result;
    }

    public boolean updateItem(String name, Integer newPrice) {
        if (newPrice < 0) throw new NegativePriceException
                ("New price can't be negative.");
        int oldPrice = inventory.get(name);
        return inventory.replace(name, oldPrice, newPrice);
    }

    public int getTotal() {
        int total = 0;
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }

    public String toBeautifulString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n// ********************* INVENTORY ******************** //\n");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            sb.append("Name: " + entry.getKey() + ", Price: " + entry.getValue() + "\n");
        }
        sb.append("Inventory: " + getCounter() + " items; tatal: " + getTotal());
        sb.append("\n// **************************************************** //\n");
        return sb.toString();
    }

}