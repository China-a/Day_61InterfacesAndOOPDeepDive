package InheritancePracticeProblems;

public class Teacher extends Person {
private Integer salary;
    public Teacher(String name, String address, Integer salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n salary " + this.salary + " euros/month";
    }
}
