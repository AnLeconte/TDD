package org.example.Exo5;

import java.util.List;

public class ProductShop {
    private final String type;
    private final String name;
    private int sellIn;
    private int quality;

    public ProductShop(String type, String name, int sellIn, int quality) {
        this.type = type;
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void update(ProductShop product) {
        int qualityChange = -1;

        if ("brie".equals(product.getType())) {
            qualityChange = 1;
        } else if ("dairy".equals(product.getType())) {
            qualityChange = -2;
        }

        product.setSellIn(product.getSellIn() - 1);

        if (product.getSellIn() < 0) {
            qualityChange *= 2;
        }

        int newQuality = product.getQuality() + qualityChange;
        if (newQuality < 0) {
            newQuality = 0;
        } else if (newQuality > 50) {
            newQuality = 50;
        }

        product.setQuality(newQuality);
    }

    public static class Shop {

        public Shop(List<ProductShop> products) {
        }

        public void update(ProductShop product) {
            int qualityChange = -1;

            if ("brie".equals(product.getType())) {
                qualityChange = 1;
            } else if ("dairy".equals(product.getType())) {
                qualityChange = -2;
            }

            product.setSellIn(product.getSellIn() - 1);

            if (product.getSellIn() < 0) {
                qualityChange *= 2;
            }

            int newQuality = product.getQuality() + qualityChange;
            if (newQuality < 0) {
                newQuality = 0;
            } else if (newQuality > 50) {
                newQuality = 50;
            }

            product.setQuality(newQuality);
        }
    }
}

