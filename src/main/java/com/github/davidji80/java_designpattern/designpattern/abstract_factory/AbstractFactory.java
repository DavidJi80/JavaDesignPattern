package com.github.davidji80.java_designpattern.designpattern.abstract_factory;

import com.github.davidji80.java_designpattern.designpattern.factory.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
