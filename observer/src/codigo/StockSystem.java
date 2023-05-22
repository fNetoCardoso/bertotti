package codigo;

import minhaInterface.*;
import java.util.List;
import java.util.ArrayList;

class StockSystem {
    private List<Observer> observers = new ArrayList<>();
    private String productName;
    private int quantity;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setProductQuantity(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(productName, quantity);
        }
    }
}