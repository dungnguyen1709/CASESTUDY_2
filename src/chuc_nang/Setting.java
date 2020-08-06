package chuc_nang;

import san_pham.Products;

import java.util.ArrayList;
import java.util.Iterator;


public class Setting {
    private ArrayList<Products> shoes;
    private Iterator<Products> iterator;

    public ArrayList<Products> getProductsSet() {
        return shoes;
    }

    public void setProductsSet(ArrayList<Products> arrayList) {
        this.shoes = arrayList;
    }

    public boolean add(Products products) {
        if (!isExit(products)) {
            shoes.add(products);
            return true;
        }
        return false;
    }

    private boolean isExit(Products products) {
        for (Products pr : shoes) {
            if (pr.getId() != null) {
                if (pr.getId().equals(products.getId()));
                return true;
            }
        }
        return false;
    }

    public void edit(Products products, String newId, String newName, String newColor, String newSize, int newPrice) {
        products.setId(newId);
        products.setSize(newSize);
        products.setName(newName);
        products.setColor(newColor);
        products.setPrice(newPrice);
    }

    public Products delete(String productId) {
        iterator = shoes.iterator();
        Products temp;
        while (iterator.hasNext()) {
            if ((temp = iterator.next()).getId().equals(productId)) {
                iterator.remove();
                return temp;
            }
        }
        return null;
    }
}
