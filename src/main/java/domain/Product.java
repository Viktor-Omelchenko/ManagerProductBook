package domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Product {

    public int length;
    private int id;
    private String name;
    private int price;


    public Product(int id, int price, String name) {



            }

    @Override
    public String toString() {
        return "Product{" +
                "length=" + length +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
