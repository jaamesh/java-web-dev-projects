package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Boolean isNew;
    private static String[] CATEGORY_TYPES = {"appetizer", "main course", "dessert"};

    public MenuItem(double price, String description, String category, Boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(price, menuItem.price) == 0 && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category) && Objects.equals(isNew, menuItem.isNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, isNew);
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public boolean equals(MenuItem itemToCompare) {
        return this.description.equals(itemToCompare.description);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
