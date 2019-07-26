package com.kgc.u2.day15.factorymodle;

public class DellMouseFactory extends AbstractFactory {
    @Override
    public Mouse factory() {
        return new DellMouse();
    }
}
