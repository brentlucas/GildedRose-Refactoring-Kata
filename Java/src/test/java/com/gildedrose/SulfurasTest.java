package com.gildedrose;

import com.gildedrose.factory.ItemFactory;
import com.gildedrose.model.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SulfurasTest {

    private ItemFactory itemFactory;

    @BeforeEach
    public void init() {
        itemFactory = new ItemFactory();
    }

    @Test
    public void sulfurasHasSetQuality() {
        Item sulfuras = itemFactory.createItem("Sulfuras, Hand of Ragnaros", 0, 50);
        Assertions.assertEquals("Sulfuras, Hand of Ragnaros, 0, 80", sulfuras.toString());
    }
}
