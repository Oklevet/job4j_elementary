package ru.job4j.oop.professions;

import ru.job4j.oop.Product;

public final class LiquidationProduct {
    private Product product;

    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
    }

    public String label() {
        return product.label();
    }
}
