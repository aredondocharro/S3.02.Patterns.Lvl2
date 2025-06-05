package stock;

import java.util.ArrayList;
import java.util.List;

public class Agent {
    private List<StockObserver> observers = new ArrayList<>();
    private double stockValue;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setStockValue(double stockValue) {
        this.stockValue = stockValue;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockValue);
        }
    }
}