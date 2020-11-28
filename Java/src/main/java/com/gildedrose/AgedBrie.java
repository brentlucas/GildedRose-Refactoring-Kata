package com.gildedrose;

class AgedBrie extends Item {
    AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
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
