import java.util.ArrayList;
import java.util.List;

public class StreamFilteringAndIteratingCollection {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        Product.ProductAdder(productList);


        productList.stream().filter(product -> product.price == 30000).forEach(product -> System.out.println(product.name));
    }
}
