package com.github.davidji80.java_designpattern.designpattern.abstract_factory;

import com.github.davidji80.java_designpattern.designpattern.factory.Circle;
import com.github.davidji80.java_designpattern.designpattern.factory.Rectangle;
import com.github.davidji80.java_designpattern.designpattern.factory.Shape;
import com.github.davidji80.java_designpattern.designpattern.factory.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
