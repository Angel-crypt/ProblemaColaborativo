package model.base;

public abstract class BaseProduct implements AppicableDiscount{
    private final String id;
    private final String name;
    private double price;
    private int amount;

    public BaseProduct(String id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getId() {
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
    public abstract void showInfo(boolean detail);
}