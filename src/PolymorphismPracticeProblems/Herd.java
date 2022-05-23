package PolymorphismPracticeProblems;

import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public String toString() {
        String out = "";
        for(Movable one: herdList) {
            out += one.toString() + "\n";
        }
        return out;
    }

    public void addToHerd(Movable movable) {
        herdList.add(movable);

    }

    public void move(int dx, int dy) {
        for(Movable one: herdList) {
            one.move(dx, dy);
        }
    }











    @Override
    public void move(Integer dx, Integer dy) {

    }
}
