package com.katchfashion.nyltics.genericsbox;

import java.util.HashMap;

class Player<K,V> extends HashMap<K,V> {
private K key;
private V value;

    @Override
    public V get(Object key) {
        return super.get(key);
    }

    @Override
    public V put(K key, V value) {
        return super.put(key, value);
    }
}
