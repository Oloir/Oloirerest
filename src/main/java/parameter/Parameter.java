package parameter;

/**
 * Основной класс параметра.
 * Будет использован для характеристик героя.
 */
public class Parameter {

    protected final int value;

    public Parameter(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

}
