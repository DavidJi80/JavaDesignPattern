package com.github.davidji80.java_designpattern.designpattern.abstract_factory;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
