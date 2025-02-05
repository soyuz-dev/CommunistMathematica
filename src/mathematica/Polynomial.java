package src.mathematica;

import java.util.ArrayList;

public class Polynomial {
    protected ArrayList<Double> polynoms = new ArrayList<>();
    int order = 0;
    public Polynomial(ArrayList<Double> polynoms){
        this.polynoms = polynoms;
        this.order = polynoms.size();
    }
    public Polynomial(double a, double b, double c){
        this.polynoms.add(c);
        this.polynoms.add(b);
        this.polynoms.add(a);
    }
}
