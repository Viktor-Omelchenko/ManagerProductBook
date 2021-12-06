package domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void shouldIdHaveAllMethodsFromSuper() {Book book = new Book();}


    @Test
    public void shouldUseEquals() {
        Book book1 = new Book(1, 100, "Name", "Aut1");
        Book book2 = new Book(1, 100, "Name", "Aut1");

        assertEquals(book1, book2);
    }


}