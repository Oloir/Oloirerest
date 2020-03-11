package V1.parameter.specific;

import parameter.BoundedParameter;

public class Intellect extends BoundedParameter {

    public Intellect(int lowerBound, int upperBound, int value) {
        super(lowerBound, upperBound, value);

    }


    public int GetInt(){
        return value;
    }




}
