package AbstractClasses;

import Interfaces.Shape;


public abstract class AbstractShape implements Shape {
    protected String figureName;

   public AbstractShape (String s){
        figureName = s;
    }

    @Override
    public String toString() {
        return "Площадь " + figureName + "а" + " равна = " + getArea();
    }

}
