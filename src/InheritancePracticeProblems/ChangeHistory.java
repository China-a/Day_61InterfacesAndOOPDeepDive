package InheritancePracticeProblems;

import java.util.AbstractList;
import java.util.ArrayList;

public class ChangeHistory {
    private AbstractList<Double> history;

    public ChangeHistory(){
    this.history = new ArrayList<>();

     }
     public void add(Double status) {
        history.add(status);
     }
     public void clear() {
         this.history.removeAll(history);
     }

    @Override
    public String toString() {
        return this.history.toString();
    }

    public Double maxValue() {
        Double max = 0.0;
        if(this.history.size() > 0) {
            for(Double one: this.history) {
                if(one > max) {
                    max = one;
                }
            }
        }

        return max;
    }

    public Double minValue(){
        Double min = this.history.get(0);
        if(this.history.size() > 0){
            for(Double one: this.history){
                if(one < min) {
                    min = one;
                }
            }
        }
        return min;
    }

    public Double sum() {
        Double sum = 0.0;
        for(Double one: this.history) {
            sum+=one;
        }
        return sum;
    }

    public Double average() {
        Double sum = this.sum();
        Integer size = this.history.size();
        if(size > 0 ) {
            return (Double) sum/size;
        }
        return 0.0;
    }
}
