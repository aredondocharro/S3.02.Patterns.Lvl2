package stock;

public class StockAgency implements StockObserver {
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(double newStockValue) {
        System.out.println("Agency " + name + " received stock update: " + newStockValue);
    }
}