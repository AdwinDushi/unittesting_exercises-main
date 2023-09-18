package ex02_product_description;

import java.util.Locale;

public class Product {
    private final String name;
    private Integer size;
    private Double percentage;

    public Product(String name, Integer size, Double percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }

    public Product(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public Product(String name, Double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String productDescription() {
        if (size == null || percentage == null) return "";
        if (percentage % 1 > 0) return String.format(Locale.US, " * %dCL %.1f%%", size, percentage);
        else return String.format(Locale.US, " * %dCL %.0f%%", size, percentage);
    }
}
