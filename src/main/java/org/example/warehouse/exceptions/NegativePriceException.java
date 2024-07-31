package org.example.warehouse.exceptions;

public class NegativePriceException extends IllegalArgumentException {
    public NegativePriceException(String s) {
        super(s);
    }
}
