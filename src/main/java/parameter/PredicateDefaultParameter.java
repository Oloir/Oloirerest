package parameter;

import java.util.function.Predicate;

public class PredicateDefaultParameter extends Parameter {

    protected final int defaultValue;

    protected final Predicate<Integer> predicate;

    public PredicateDefaultParameter(int value, int defaultValue, Predicate<Integer> predicate) {
        super(predicate.test(value) ? value : defaultValue);

        this.defaultValue = defaultValue;
        this.predicate = predicate;
    }

    public PredicateDefaultParameter(int value, int defaultValue) {
        super(value);
        this.defaultValue = defaultValue;
        this.predicate = x -> true;
    }
}
