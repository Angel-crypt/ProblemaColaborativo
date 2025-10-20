package model.base;

public abstract class BaseProduct implements AppicableDiscount{
    private final int id;
    private final String name;
    private double price;
    private int amount;

    public BaseProduct(int id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) { this.price = price; }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) { this.amount = amount; }

    public abstract void showInfo();
}