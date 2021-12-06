package repository;

import domain.Product;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    public ProductRepository repository = new ProductRepository();
    private Book book = new Book();



    @Test
    public void shouldSaveOneItem() {


        Product[] expected = new Product[]{};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }


    }
