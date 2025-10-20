package test;

import model.base.BaseProduct;
import model.products.ElectronicProduct;

public class testElectronicProduct {
    public testElectronicProduct() {
        BaseProduct computadora = new ElectronicProduct("Dell 5530", 1200.0, 12, "Dell", "5530", "laptop");
        computadora.showInfo();
        computadora.showInfo(true);
    }
}
