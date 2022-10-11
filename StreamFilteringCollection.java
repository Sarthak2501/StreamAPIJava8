import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class StreamFilteringCollection {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        Product.ProductAdder(productList);


        List<Float> productPriceList2 = productList.stream()
                .filter(p -> p.price < 30000)//filtering data
                .map(p -> p.price)//fetching price
                .collect(Collectors.toList());//collecting as list
        System.out.println(productPriceList2);
    }
}

