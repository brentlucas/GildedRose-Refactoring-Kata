package com.gildedrose.model;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void doUpdate() {
        if (quality < 50) {
            quality++;

            if (sellIn < 11) {
                incrementQuality();
            }

            if (sellIn < 6) {
                incrementQuality();
            }
        }

        if (--sellIn < 0) {
            quality = 0;
        }
    }

    private void incrementQuality() {
        if (quality < 50) {
            quality++;
        }
    }
}
