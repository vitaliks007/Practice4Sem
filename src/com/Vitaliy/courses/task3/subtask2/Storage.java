package com.Vitaliy.courses.task3.subtask2;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private ArrayList<Product> products;

    public Storage(Product ... products) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.addAll(List.of(products));
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public int weight() {
        return products.stream().reduce(0, (w1, w2) -> w1 + w2.getWeight(), Integer::sum);
    }
}
