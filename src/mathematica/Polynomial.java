package src.mathematica;

import java.util.ArrayList;

public class Polynomial {
    protected ArrayList<Double> polynoms = new ArrayList<>();
    int order = 0;
    public Polynomial(ArrayList<Double> polynoms){
        this.polynoms = polynoms;
        this.order = polynoms.size()-1;
    }
    public Polynomial(double a, double b, double c){
        this.polynoms.add(c);
        this.polynoms.add(b);
        this.polynoms.add(a);
        this.order = 2;
    }
    public double discriminant() throws Exception{
        if(this.order == 2){
            double bsquared = Math.pow(polynoms.get(1), 2);
            double fourac = 4 * polynoms.get(0) * polynoms.get(2);
            return bsquared - fourac;
        } else {
            throw new Exception("Functionality for this has not been made yet.");
        }
    }
}
