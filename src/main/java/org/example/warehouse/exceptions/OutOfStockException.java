package org.example.warehouse.exceptions;

public class OutOfStockException extends IllegalArgumentException {
    public OutOfStockException(String s) {
        super(s);
    }
}
