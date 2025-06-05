package stock;

public class Main {
    public static void main(String[] args) {
        Agent stockAgent = new Agent();

        StockAgency agency1 = new StockAgency("AlphaInvest");
        StockAgency agency2 = new StockAgency("BetaFinance");
        StockAgency agency3 = new StockAgency("GammaCorp");

        stockAgent.addObserver(agency1);
        stockAgent.addObserver(agency2);
        stockAgent.addObserver(agency3);

        stockAgent.setStockValue(150.75);
        stockAgent.setStockValue(142.30);
        stockAgent.removeObserver(agency2);
        stockAgent.setStockValue(155.00);
    }
}