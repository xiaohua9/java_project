package com.u2.day15.abstractfactory;

public class DellFactory extends AbstractFactory {
    @Override
    public Mouse factoryMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard factoryKeyboard() {
        return new DellKeyboard();
    }
}
