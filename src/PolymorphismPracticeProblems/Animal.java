package PolymorphismPracticeProblems;

public class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;

    }

    public void eat() {
        System.out.println(animalName + "eats");
    }

    public void sleep() {
        System.out.println(animalName + "sleeps");
    }

    public String getAnimalName() {
        return animalName;
    }
}
