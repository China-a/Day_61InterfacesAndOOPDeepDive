package PolymorphismPracticeProblems;

public class Organism  implements Movable {
 private Integer x;
 private Integer y;

 public Organism(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public String toString() {
        return "x: " + x + " ; y: " + y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void move(Integer dx, Integer dy) {

    }
}
