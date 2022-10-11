import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamListToMap {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        Product.ProductAdder(productList);



        Map<Integer,String> productPriceMap =
                productList.stream()
                        .collect(Collectors.toMap(p -> p.id , p -> p.name));

        System.out.println(productPriceMap);
    }
}
