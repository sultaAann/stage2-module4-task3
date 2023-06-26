package com.mjc.stage2;

import java.util.ArrayList;
import java.util.List;

public class ShopStock {
    private final List<Product> productList;
    private FilteringStrategy filteringStrategy;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List executeFilteringStrategy(FilteringStrategy filteringStrategy) {
        List<Product> res = new ArrayList<>();
        for (Product product: productList) {
            if (filteringStrategy.filter(product)) res.add(product);
        }
        return res;
    }
}
