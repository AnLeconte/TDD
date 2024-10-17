package Exo5;

import org.example.Exo5.ProductShop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class ShopTest {

    @Test
    public void testNormalProductBeforeSellIn() {
        ProductShop product = new ProductShop("normal", "Normal Product", 10, 20);
        ProductShop.Shop shop = new ProductShop.Shop(List.of(product));
        shop.update(product);
        assertEquals(9, product.getSellIn());
        assertEquals(19, product.getQuality());
    }

    @Test
    public void testNormalProductAfterSellIn() {
        ProductShop product = new ProductShop("normal", "Normal Product", 0, 20);
        ProductShop.Shop shop = new ProductShop.Shop(List.of(product));
        shop.update(product);
        assertEquals(-1, product.getSellIn());
        assertEquals(18, product.getQuality());
    }

    @Test
    public void testQualityNeverNegative() {
        ProductShop product = new ProductShop("normal", "Normal Product", 10, 0);
        ProductShop.Shop shop = new ProductShop.Shop(List.of(product));
        shop.update(product);
        assertEquals(9, product.getSellIn());
        assertEquals(0, product.getQuality());
    }

    @Test
    public void testBrieAging() {
        ProductShop product = new ProductShop("brie", "Aged Brie", 10, 10);
        ProductShop.Shop shop = new ProductShop.Shop(List.of(product));
        shop.update(product);
        assertEquals(9, product.getSellIn());
        assertEquals(11, product.getQuality());
    }

    @Test
    public void testQualityNeverMoreThanFifty() {
        ProductShop product = new ProductShop("brie", "Aged Brie", 10, 50);
        ProductShop.Shop shop = new ProductShop.Shop(List.of(product));
        shop.update(product);
        assertEquals(9, product.getSellIn());
        assertEquals(50, product.getQuality());
    }

    @Test
    public void testDairyProductDegradation() {
        ProductShop product = new ProductShop("dairy", "Milk", 10, 20);
        ProductShop shop = new ProductShop(Arrays.asList(product));
        shop.update(product);
        assertEquals(9, product.getSellIn());
        assertEquals(18, product.getQuality());
    }
}

