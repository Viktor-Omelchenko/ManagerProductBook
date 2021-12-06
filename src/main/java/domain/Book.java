package domain;


import java.util.Collection;


public class Book {


    private Collection<Object> author;

    public Book(int id, int price, String name, String author) {

    }

    public Book() {
    }

    public Collection<Object> getAuthor() {
        return author;
    }

    public void setAuthor(Collection<Object> author) {
        this.author = author;
    }

    public void getTitle() {


        class book extends Product {
            private String name;
            private String author;

            public book(int id, int price, String name, String author) {
                super(id, price, name);
                this.author = author;

            }


            class Smartphone extends Product {
                private String name;
                private String made;

                public Smartphone(int id, int price, String name, String made) {
                    super(id, price, name);
                    this.made = made;


                }

                @Override
                public String toString() {
                    return "Book{" +
                            "length=" + length +
                            ", name='" + name + '\'' +
                            ", author =" + author + '\'' +
                            '}';
                }
            }
        }
    }
}
