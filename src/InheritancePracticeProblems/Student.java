package InheritancePracticeProblems;

public class Student extends Person {
    public Integer credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;

    }

    public Integer credits() {
        return this.credits;
    }
    public void study() {
        credits++;
    }

    @Override
    public String toString() {
        return  super.toString() +  "\n Study credits " + this.credits;
    }

}
