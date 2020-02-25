package parameter;

/**
 * Основной класс Параметра, который будет впоследствии использован
 * для работы с характеристиками героя.
 *
 * Наследует абстрактный класс Number, чтобы принимать в конструктор
 * любой агрумент числового типа.
 *
 */

public class Parameter extends Number {

    protected Number value;

    public Parameter(Number p) {
        this.value = p;
    }

    public int intValue() {
        return value.intValue();
    }

    public long longValue() {
        return value.longValue();
    }

    public float floatValue() {
        return value.floatValue();
    }

    public double doubleValue() {
        return value.doubleValue();
    }
}
