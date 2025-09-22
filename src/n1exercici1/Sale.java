package n1exercici1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale(double totalPrice){
        this.totalPrice = totalPrice;
        this.products = new ArrayList<Product>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void calculateTotal(){

        if (products.isEmpty()) {
            throw new EmptySaleException("Per fer una venda primer has d’afegir productes.");
        }

        for(Product p : products){
            totalPrice += p.getPrice();
        }

    }

}

