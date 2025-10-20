package model.products;

import model.base.AppicableDiscount;
import model.base.BaseProduct;

public class ElectronicProduct extends BaseProduct implements AppicableDiscount {
    private static int CountElectronicProduct = 0;

    private final String brand;
    private final String model;
    private String type;

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public ElectronicProduct(String name, double price, int amount, String brand, String model, String type) {
        super(generateId(brand, model), name, price, amount);
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    private static String generateId(String brand, String model){
        String brandData = brand.length() >= 2
                ? brand.substring(0,2).toUpperCase()
                : brand.toUpperCase();

        String modelData = model.length() >= 2
                ? model.substring(0, 2).toUpperCase()
                : model.toUpperCase();

        String counter = String.format("%03d", CountElectronicProduct);
        CountElectronicProduct++;

        return counter + "-" + modelData + "-" + brandData;
    }

    @Override
    public void showInfo() {
        System.out.println("Producto Electrónico: "+getModel()+"; "+getBrand()+"; "+getId());
    }

    @Override
    public void showInfo(boolean detail){
        System.out.println("Producto Electrónico:");
        System.out.println("    ID: "+getId());
        System.out.println("    Nombre: "+getName());
        System.out.println("    Precio: "+getPrice());
        System.out.println("    Cantidad: "+getAmount());
        System.out.println("    Marca: "+getBrand());
        System.out.println("    Modelo: "+getModel());
    }
}
