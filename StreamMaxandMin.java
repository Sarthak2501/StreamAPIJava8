import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMaxandMin {
    public static void main(String[] args) {

        List <Product> productList = new ArrayList<Product>();

        Product.ProductAdder(productList);


        long count = productList.stream()
                .filter(product -> product.price < 30000).
                count();

        System.out.println(count);


        //converting List into set using stream
        Set<Float> productpriceList = productList.stream()
                .filter(product -> product.price < 30000)
                .map(product -> product.price)
                .collect(Collectors.toSet());

        System.out.println(productpriceList);

    }
}
