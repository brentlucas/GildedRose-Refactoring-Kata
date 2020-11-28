package com.gildedrose.model;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void doUpdate() {
        incrementQuality();

        sellIn--;

        if (sellIn < 0) {
            incrementQuality();
        }
    }

    private void incrementQuality() {
        if (quality < 50) {
            quality++;
        }
    }
}
