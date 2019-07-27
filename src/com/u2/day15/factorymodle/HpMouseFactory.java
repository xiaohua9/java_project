package com.u2.day15.factorymodle;

public class HpMouseFactory extends AbstractFactory {
    @Override
    public Mouse factory() {
        return new HpMouse();
    }
}
