package com.thoughtworks.recieptsgenerator;

public class Goods {
    private String nameOfItem;
    private double pricePerUnit;

    public Goods(String nameOfItem, double pricePerUnit) {
        this.nameOfItem = nameOfItem;
        this.pricePerUnit = pricePerUnit;
    }

    public double salesTax() {
        if (isTaxable()) {
            return 0.0;
        }
        else
            return pricePerUnit * 10 / 100.0;
    }

    public double importDuty() {
        if (isImported()) {
            return pricePerUnit * 5 / 100.0;
        }
        return 0.0;
    }

    private boolean isTaxable() {
        return (nameOfItem.contains("book")) || (nameOfItem.contains("chocolate")) || (nameOfItem.contains("pill"));
    }

    private boolean isImported() {
        return nameOfItem.contains("imported");
    }
}
