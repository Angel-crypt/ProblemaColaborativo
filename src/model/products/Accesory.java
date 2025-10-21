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

    // Método para generar el ID automáticamente
    private static String generateId(String type) {
        String typeData = type.length() >= 2
                ? type.substring(0, 2).toUpperCase()
                : type.toUpperCase();

        String counter = String.format("%03d", countAccessory);
        countAccessory++;

        return counter + "-AC-" + typeData;
    }
}
