package V1.parameter;


import java.util.function.Predicate;

public class PredicateDefaultParameter extends Parameter {

    int defaultValue;

    Predicate<Integer> predicate;


 // Конструктор для ситуации, когда предикат передан:

    public PredicateDefaultParameter(int value, int defaultValue, Predicate<Integer> predicate) {
        super(predicate.test(value) ? value : defaultValue);

        this.defaultValue = defaultValue;
        this.predicate = predicate;
    }


    // Конструктор для ситуации, когда предикат НЕ передан:

    public PredicateDefaultParameter(int value, int defaultValue) {
        super(value);
        this.defaultValue = defaultValue;
        this.predicate = x -> true;




    }
}
