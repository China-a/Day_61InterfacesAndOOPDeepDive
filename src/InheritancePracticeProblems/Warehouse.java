package InheritancePracticeProblems;

public class Warehouse {
    private Double capacity;
    private  Double balance;

    public Warehouse(Double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Double getCapacity() {
        return this.capacity;
    }

    public Double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(Double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(Double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }

    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}

