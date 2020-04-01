package com.github.davidji80.java_designpattern.designpattern.factory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
