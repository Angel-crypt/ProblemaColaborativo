package model.products;

import model.base.BaseProduct;

public class ElectronicProduct extends BaseProduct {
    private final String brand;
    private final String model;

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public ElectronicProduct(int id, String name, double price, int amount, String brand, String model) {
        super(id, name, price, amount);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void showInfo() {
        
    }
}
