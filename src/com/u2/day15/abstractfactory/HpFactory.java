package com.u2.day15.abstractfactory;

public class HpFactory extends AbstractFactory {
    @Override
    public Mouse factoryMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard factoryKeyboard() {
        return new HpKeyboard();
    }
}
