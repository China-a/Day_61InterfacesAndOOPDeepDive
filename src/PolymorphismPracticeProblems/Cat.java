package PolymorphismPracticeProblems;

public class Cat extends Animal implements NoiseCapable {
    public Cat() {
        super("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    public void purr(){
        System.out.println(this.getAnimalName()+" purrs");
    }

    public void makeNoise() {
        this.purr();
    }
}
