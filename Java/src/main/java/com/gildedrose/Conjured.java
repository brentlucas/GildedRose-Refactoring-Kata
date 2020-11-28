package com.gildedrose;

public class Conjured extends Item {
    Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
        if (quality > 0) {
            quality = Math.max(0, quality - 2);
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            if (quality > 0) {
                quality = Math.max(0, quality - 2);
            }
        }
    }
}
