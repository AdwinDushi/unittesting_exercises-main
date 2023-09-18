package ex02_product_description;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void productDescription() {
        Product product = new Product("name", 33, 6.3);

        assertEquals(" * 33CL 6.3%", product.productDescription());
    }

    @Test
    void productDescription_wholeNumber_() {
        Product product = new Product("name", 33, 5.0);

        assertEquals(" * 33CL 5%", product.productDescription());
    }

    @Test
    void productDescription_absentSize_returnEmpty() {
        Product product = new Product("name", 33);

        assertEquals("", product.productDescription());
    }

    @Test
    void productDescription_absentPercentage_returnEmpty() {
        Product product = new Product("name", 6.0);

        assertEquals("", product.productDescription());
    }
}