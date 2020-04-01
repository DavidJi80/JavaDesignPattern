package com.github.davidji80.java_designpattern.designpattern.abstract_factory;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
