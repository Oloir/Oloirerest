package parameter.specific;

import parameter.GreaterThanParameter;

public class Experience extends GreaterThanParameter {
    public Experience(int value, int lowerBound) {
        super(value, lowerBound);
        lowerBound=0;





    }

    public int GetExp(){
        return value;
    }

    public int Implement(int x){
         int step = x;
        return GetExp()+step;

    }




}
