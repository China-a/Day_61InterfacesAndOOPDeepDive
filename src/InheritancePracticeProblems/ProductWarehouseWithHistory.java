package InheritancePracticeProblems;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, Double capacity, Double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history(){
        return this.history.toString();
    }

    public void addToWarehouse(Double amount) {
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }

    public double takeFromWarehouse(Double amount) {
        Double valueAfterRemoved = super.takeFromWarehouse(amount);
        this.history.add(getBalance());
        return valueAfterRemoved;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
