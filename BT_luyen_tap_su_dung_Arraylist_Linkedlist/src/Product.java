import java.util.ArrayList;

public class Product {
    public static void main(String[] args) {
        ProductManager myProduct = new ProductManager();
        myProduct.push(0,"lamBor");
        myProduct.push(1,"audi");
        myProduct.push(2,"lexus");
        myProduct.push(3,"toyota");

        myProduct.exit(2,"honda");

        myProduct.push(2,"kia");

        System.out.println( myProduct.search("kia"));

    }
}
