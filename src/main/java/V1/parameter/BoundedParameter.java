package V1.parameter;


public class BoundedParameter extends Parameter {

    protected  GreaterThanParameter lowerBound;
    protected  LessThanParameter upperBound;

    public BoundedParameter(int lowerBound, int upperBound, int value) {
        super(value);
        this.lowerBound = new GreaterThanParameter(value, lowerBound);
        this.upperBound = new LessThanParameter(value, upperBound);
    }


}
