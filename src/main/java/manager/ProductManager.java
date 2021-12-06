package manager;

import domain.Book;
import domain.Product;
import repository.ProductRepository;

import static java.util.regex.Pattern.matches;

public class ProductManager {

    private ProductRepository repository;
    private Object String;
    private Object Product;
   


    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }


    public Product[] searcyBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(java.lang.String.valueOf(product), text)) {
                Product[] tmp = new Product[result.length + 1];

                tmp[tmp.length - 1] = product;
                result = tmp;

                System.arraycopy(tmp, 1, 1, 1, tmp.length);
            }
        }
        return result;
    }




        }

