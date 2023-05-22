package codigo;

import minhaInterface.Observer;

class StockManager implements Observer {
    private String name;

    public StockManager(String name) {
        this.name = name;
    }

    public void update(String productName, int quantity) {
        System.out.println("Stock Manager " + name + " received an update:");
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
}