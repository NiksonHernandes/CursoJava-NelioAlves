package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantityAdd) {
        this.quantity += quantityAdd;
    }

    public void removeProducts(int quantityRemove) {
        this.quantity -= quantityRemove;
    }

    public String toString() {
        return name + ",  $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }

}
