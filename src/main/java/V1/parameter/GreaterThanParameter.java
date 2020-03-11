package V1.parameter;

import parameter.PredicateDefaultParameter;

public class GreaterThanParameter extends PredicateDefaultParameter {

    public GreaterThanParameter(int value, int lowerBound) {
        super(value, lowerBound, p -> p >= lowerBound);



    }
}
