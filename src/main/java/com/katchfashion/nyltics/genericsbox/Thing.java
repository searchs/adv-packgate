package com.katchfashion.nyltics.genericsbox;

class Thing<T> {

    private T thing;

    public Thing(T t) {
        this.thing = t;
    }

    public T getThing() {
        return thing;
    }



}
