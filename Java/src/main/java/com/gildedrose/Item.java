package com.gildedrose;

public class Item {
    private final String name;

    int sellIn;
    int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item createItem(String name, int sellIn, int quality) {
        Item result;
        switch (name) {
            case "Aged Brie":
                result = new AgedBrie(sellIn, quality);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                result = new BackstagePass(sellIn, quality);
                break;
            case "Sulfuras, Hand of Ragnaros":
                result = new Sulfuras(sellIn, quality);
                break;
            case "Conjured Mana Cake":
                result = new Conjured(sellIn, quality);
                break;
            default:
                result = new Item(name, sellIn, quality);
                break;
        }
        return result;
    }

    protected void doUpdateQuality() {
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
