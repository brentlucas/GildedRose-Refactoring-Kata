package com.gildedrose;

public class Sulfuras extends Item {
    Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
    }
}
