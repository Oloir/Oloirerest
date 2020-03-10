package parameter;

import java.util.function.Predicate;

/**
 * Расширенный класс параметра с предикатом и значением по умолчанию.
 *
 */

public class PredicateDefaultParameter extends Parameter {

    protected final int defaultValue;

    protected final Predicate<Integer> predicate;

    /**
     *
     * @param value — актуальное значение, которое будет провалидировано
     * @param defaultValue — значение по умолчанию будет выставлено в случае нарушения валидации
     * @param predicate — предикат (условия), по которому проверяется исходное значение
     *
     *                  Вся логика валидации встроена в вызов конструктора родителя (Parameter)
     *                  посредством тернарного оператора.
     *
     *                  (условие) ? (значение в случае выполнения) : (значение в случае невыполнения)
     *
     */
    public PredicateDefaultParameter(int value, int defaultValue, Predicate<Integer> predicate) {
        super(predicate.test(value) ? value : defaultValue);

        this.defaultValue = defaultValue;
        this.predicate = predicate;
    }

    /**
     *
     * Если предикат не передан при инстанциировании, то вызывается вторая версия конструктора,
     * где предикат вернет истину для любого значения.
     */
    public PredicateDefaultParameter(int value, int defaultValue) {
        super(value);
        this.defaultValue = defaultValue;
        this.predicate = x -> true;




    }
}
