package org.example.app.item;

public class Clothes {
    private String name;
    private String manufacturer;
    private String color;
    private String size;
    private double price;

    public Clothes(String name, String manufacturer, String color, String size, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
