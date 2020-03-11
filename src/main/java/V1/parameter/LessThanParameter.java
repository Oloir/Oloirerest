package V1.parameter;

import parameter.PredicateDefaultParameter;

public class LessThanParameter extends PredicateDefaultParameter {

    public LessThanParameter(int value, int upperBound) {
        super(value, upperBound, p -> p <= upperBound);
    }
}
