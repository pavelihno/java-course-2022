package ru.mirea.java.practice6.Factory;

public abstract class Shop {
    public Product orderProduct(ProductType type){
        Product product = createProduct(type);

        product.makeProduct();
        product.printMessage();

        return product;
    }

    protected abstract Product createProduct(ProductType type);
}