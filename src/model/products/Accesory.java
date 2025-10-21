package model.products;

import model.base.BaseProduct;
import model.base.AppicableDiscount;

public class Accessory extends BaseProduct implements AppicableDiscount {

    private static int countAccessory = 0;
    private String type;

    public Accessory(String name, double price, int amount, String type) {
        super(generateId(type), name, price, amount);
        this.type = type;
    }

    private static String generateId(String type) {
        String typeData = type.length() >= 2
                ? type.substring(0, 2).toUpperCase()
                : type.toUpperCase();

        String counter = String.format("%03d", countAccessory);
        countAccessory++;

        return counter + "-AC-" + typeData;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Implementación del método aplicarDescuento
    @Override
    public double aplicarDescuento(double porcentaje) {
        double descuento = getPrice() * (porcentaje / 100);
        double nuevoPrecio = getPrice() - descuento;
        setPrice(nuevoPrecio);
        return nuevoPrecio;
    }

    @Override
    public void showInfo() {
        System.out.println("Accesorio: " + getName() + " | Tipo: " + getType() + " | ID: " + getId());
    }

    @Override
    public void showInfo(boolean detail) {
        System.out.println("Accesorio:");
        System.out.println("    ID: " + getId());
        System.out.println("    Nombre: " + getName());
        System.out.println("    Precio: " + getPrice());
        System.out.println("    Cantidad: " + getAmount());
        System.out.println("    Tipo: " + getType());
    }
}
