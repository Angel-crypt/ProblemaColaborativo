package model.products;

import model.base.BaseProduct;

public class Accessory extends BaseProduct {

    private static int countAccessory = 0;
    private final String type;

    public Accessory(String name, double price, int amount, String type) {
        super(generateId(type), name, price, amount);
        this.type = type;
    }

    private static String generateId(String type) {
        String typeCode;
        if (type == null || type.trim().isEmpty()) {
            typeCode = "XX";
        } else if (type.length() >= 2) {
            typeCode = type.substring(0, 2).toUpperCase();
        } else {
            typeCode = type.toUpperCase();
        }

        String counter = String.format("%03d", countAccessory);
        countAccessory++;
        return counter + "-ACC-" + typeCode;
    }

    public String getType() {
        return type;
    }

    // Mostrar info resumida
    @Override
    public void showInfo() {
        System.out.println("Accesorio: " + getName() + " | Tipo: " + getType() + " | ID: " + getId());
    }

    // Mostrar info detallada
    @Override
    public void showInfo(boolean detail) {
        System.out.println("Accesorio (detalle):");
        System.out.println("    ID: " + getId());
        System.out.println("    Nombre: " + getName());
        System.out.println("    Precio: " + getPrice());
        System.out.println("    Cantidad: " + getAmount());
        System.out.println("    Tipo: " + getType());
    }
}
