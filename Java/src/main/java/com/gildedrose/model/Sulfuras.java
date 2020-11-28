package com.gildedrose.model;

public class Sulfuras extends Item {
    private static final int QUALITY = 80;

    public Sulfuras(int sellIn) {
        super("Sulfuras, Hand of Ragnaros", sellIn, QUALITY);
    }

    @Override
    public void doUpdate() {
    }
}
