package com.gildedrose.model;

public class Conjured extends Item {
    public Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public void doUpdate() {
        decrementQuality();

        sellIn--;

        if (sellIn < 0) {
            decrementQuality();
        }
    }

    private void decrementQuality() {
        if (quality > 0) {
            quality = Math.max(0, quality - 2);
        }
    }
}
