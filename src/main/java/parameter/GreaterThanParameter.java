package parameter;

import java.util.function.Predicate;

public class GreaterThanParameter extends PredicateDefaultParameter {

    public GreaterThanParameter(int value, int lowerBound) {
        super(value, lowerBound, p -> p >= lowerBound);



    }
}
