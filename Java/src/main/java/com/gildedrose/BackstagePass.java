package com.gildedrose;

class BackstagePass extends Item {
    BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
        if (quality < 50) {
            quality++;

            if (sellIn < 11) {
                incrementQuality();
            }

            if (sellIn < 6) {
                incrementQuality();
            }
        }

        sellIn--;

        if (sellIn < 0) {
            quality = 0;
        }
    }

    private void incrementQuality() {
        if (quality < 50) {
            quality++;
        }
    }
}
