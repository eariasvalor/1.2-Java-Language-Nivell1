package n1exercici1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale(){
        this.totalPrice = 0;
        this.products = new ArrayList<Product>();
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        if(p == null) {
            throw new IllegalArgumentException("The product cannot be null.");
        }
        products.add(p);
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public void clearProducts() {
        products.clear();
    }

    public BigDecimal calculateTotal() throws EmptySaleException {

        if (products.isEmpty()) {
            throw new EmptySaleException();
        }
        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Product p : products){
            totalPrice = totalPrice.add(p.getPrice());
        }

        return totalPrice;

    }

}

