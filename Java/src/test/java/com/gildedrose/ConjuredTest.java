package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConjuredTest {

    @Test
    public void testConjured() {
        testUpdateQuality(0, 0, -1, 0);
    }

    @Test
    public void testConjured_doubleDegradation() {
        testUpdateQuality(1, 10, 0, 8);
    }

    @Test
    public void testConjured_doubleDegradation_pastSellIn() {
        testUpdateQuality(0, 10, -1, 6);
    }

    @Test
    public void testConjured_qualityNeverNegative() {
        testUpdateQuality(1, 1, 0, 0);
    }

    @Test
    public void testConjured_qualityNeverNegative_pastSellIn() {
        testUpdateQuality(0, 3, -1, 0);
    }

    private void testUpdateQuality(int sellIn, int quality, int expectedSellIn, int expectedQuality) {
        Item item = Item.createItem("Conjured Mana Cake", sellIn, quality);
        item.doUpdateQuality();
        Assertions.assertEquals(expectedSellIn, item.sellIn);
        Assertions.assertEquals(expectedQuality, item.quality);
    }
}
