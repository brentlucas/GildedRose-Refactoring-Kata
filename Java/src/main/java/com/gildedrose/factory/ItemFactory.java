package com.gildedrose.factory;

import com.gildedrose.model.*;

public class ItemFactory {
    public Item createItem(String name, int sellIn, int quality) {
        Item item;
        switch (name) {
            case "Aged Brie":
                item = new AgedBrie(sellIn, quality);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                item = new BackstagePass(sellIn, quality);
                break;
            case "Sulfuras, Hand of Ragnaros":
                item = new Sulfuras(sellIn, quality);
                break;
            case "Conjured Mana Cake":
                item = new Conjured(sellIn, quality);
                break;
            default:
                item = new Item(name, sellIn, quality);
                break;
        }
        return item;
    }
}
