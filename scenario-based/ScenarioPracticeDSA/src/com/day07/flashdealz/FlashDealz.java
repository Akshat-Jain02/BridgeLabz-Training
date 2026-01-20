package com.day07.flashdealz;

import java.util.ArrayList;
import java.util.List;

class FlashDealz {
    private List<Product> products;

    public FlashDealz() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public int getProductCount() {
        return products.size();
    }

    public void sortByDiscountDescending() {
        quickSort(products, 0, products.size() - 1);
    }

    private void quickSort(List<Product> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private int partition(List<Product> list, int low, int high) {
        Product pivot = list.get(high);
        double pivotDiscount = pivot.getDiscountPercent();

        int i = low - 1;

        for (int j = low; j < high; j++) {
            Product current = list.get(j);
            if (current.getDiscountPercent() > pivotDiscount) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private void swap(List<Product> list, int a, int b) {
        Product temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public void showTopDeals(int count) {
        int limit = Math.min(count, products.size());

        System.out.println("\n          Top " + limit + " Flash Deals (by discount %)");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Product                    | Original → Deal   | Discount");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < limit; i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Total products: " + products.size() + "\n");
    }
}