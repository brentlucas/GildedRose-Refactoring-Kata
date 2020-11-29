package com.gildedrose.model;

public class RegularItem extends Item {
    public RegularItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void doUpdate() {
        decrementQuality();

        if (--sellIn < 0) {
            decrementQuality();
        }
    }

    private void decrementQuality() {
        if (quality > 0) {
            quality--;
        }
    }
}
