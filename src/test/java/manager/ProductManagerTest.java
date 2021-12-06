package manager;

import domain.Book;
import domain.Product;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest<product> {

    private final Product product = new Product();
    private final ProductRepository repo = Mockito.mock(ProductRepository.class);
    private Object Product;


    @Test



        public boolean matches(Product product, String search){
                if (Product instanceof Book) {
                    Book book = (Book) Product;
                    if (book.getAuthor().contains(search)) {
                        return true;
                    }
                    if (!book.getTitle().contains(search)) {
                        return false;
                    }
                    return true;
                }

                return false;
            }
        }
