package n1exercici1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale(){
        this.totalPrice = totalPrice;
        this.products = new ArrayList<Product>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void calculateTotal() throws EmptySaleException {

        if (products.isEmpty()) {
            throw new EmptySaleException();
        }
        totalPrice = 0;
        for(Product p : products){
            totalPrice += p.getPrice();
        }

    }

}

