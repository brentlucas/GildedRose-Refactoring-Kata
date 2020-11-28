package com.gildedrose.model;

public class Item {
    private final String name;

    int sellIn;
    int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void doUpdate() {
        decrementQuality();

        sellIn--;

        if (sellIn < 0) {
            decrementQuality();
        }
    }

    private void decrementQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
