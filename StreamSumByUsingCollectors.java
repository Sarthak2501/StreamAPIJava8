import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSumByUsingCollectors {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();

        Product.ProductAdder(productList);


        double totalprice3 = productList.stream()
                .collect(Collectors.summingDouble(product -> product.price));

        System.out.println(totalprice3);
    }
}
