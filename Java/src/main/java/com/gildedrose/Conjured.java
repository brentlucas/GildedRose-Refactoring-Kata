package com.gildedrose;

class Conjured extends Item {
    Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
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
