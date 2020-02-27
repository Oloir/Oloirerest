package parameter;

import java.util.function.Predicate;

public class BoundedParameter extends Parameter {

    protected final GreaterThanParameter lowerBound;
    protected final LessThanParameter upperBound;

    public BoundedParameter(int lowerBound, int upperBound, int value) {
        super(value);
        this.lowerBound = new GreaterThanParameter(value, lowerBound);
        this.upperBound = new LessThanParameter(value, upperBound);
    }

    // TODO: 25/02/2020 Создать в пакете parameter подпакет specific и определить в нем класс Intellect как наслледника BoundedParameter
}
