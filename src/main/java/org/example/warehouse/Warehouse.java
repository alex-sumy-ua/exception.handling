package org.example.warehouse;

import org.example.warehouse.exceptions.DoubleItemException;
import org.example.warehouse.exceptions.NegativePriceException;
import org.example.warehouse.exceptions.OutOfStockException;

public class Warehouse {

    public static void main(String[] args) {

        InventoryManager im = new InventoryManager();
        im.addItem("Comb", 10);
        im.addItem("Desk", 150);
        im.addItem("Chair", 100);
        im.addItem("Lamp", 20);
        im.addItem("Laptop", 900);
        try {
            im.addItem("Bed", -200);
        } catch (NegativePriceException npe) {
            System.out.println(npe.getMessage() + "\nWe could not add the item with negative price!!!\n");
        }
        im.addItem("Bed", 200);
        im.updateItem("Chair", 120);
        im.removeItem("Bed");
        try {
            im.removeItem("Rug");
        } catch (OutOfStockException oose) {
            System.out.println(oose.getMessage() + "\nTry again.\n");
        }
        try {
            im.updateItem("Chair", -98);
        } catch (NegativePriceException npe) {
            System.out.println(npe.getMessage() + "\nWe could not set negative price for the item!!!\n");
        }
        try {
            im.addItem("Comb", 25);
        } catch (DoubleItemException die) {
            System.out.println(die.getMessage() + "\nTry again.");
        }
        System.out.println(im.toBeautifulString());


    }
}
