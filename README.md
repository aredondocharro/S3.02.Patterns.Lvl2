# 📈 Stock Market Observer – Observer Design Pattern

## 📄 Description

This project demonstrates the use of the **Observer** design pattern in a stock market simulation.  
A **Stock Agent** (Observable) notifies multiple **Stock Agencies** (Observers) when the stock value changes (increases or decreases).

This pattern allows decoupling between the subject (stock agent) and its observers (agencies), making the system flexible and extensible for new observers without modifying existing code.

---

## 💻 Technologies Used

- Java 17+
- Gradle (Build System)
- IntelliJ IDEA (or any preferred Java IDE)

---

## 🧩 Features

- Simulates a stock market system with an observable stock agent.
- Multiple agencies receive notifications when stock prices change.
- Supports adding and removing observers dynamically.
- Clear separation between observer and observable.

---

## 📁 Project Structure

- `stock` package: Contains all classes:
    - `Agent`: Observable (subject) managing stock value changes.
    - `StockObserver`: Interface for observers.
    - `StockAgency`: Concrete implementation of `StockObserver`.
    - `Main`: Demonstrates the pattern in action.

---

## 📦 Installation & Execution

**Clone the project:**
```bash
git clone https://github.com/yourusername/stock-market-observer.git
```

**Open in your IDE:**
1. File > Open > Select `stock-market-observer` folder
2. Configure SDK (Java 17 or compatible)

**Run the application:**
Locate `Main.java` > Right-click > Run

---

## 🌐 Example Output

```
Agency AlphaInvest received stock update: 150.75
Agency BetaFinance received stock update: 150.75
Agency GammaCorp received stock update: 150.75
Agency AlphaInvest received stock update: 142.3
Agency BetaFinance received stock update: 142.3
Agency GammaCorp received stock update: 142.3
Agency AlphaInvest received stock update: 155.0
Agency GammaCorp received stock update: 155.0
```

---

## 🚀 Extendability

To add a new observer:
1. Implement the `StockObserver` interface in a new class.
2. Add an instance of the new observer to the agent using `addObserver()`.

To support more complex stock data:
1. Extend the `Agent` class with additional attributes (e.g., stock name, company, etc.).
2. Update the `StockObserver` interface and `StockAgency` implementation accordingly.

---

## 📚 License

This project is licensed under the MIT License.