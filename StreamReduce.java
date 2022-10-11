import java.util.ArrayList;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        Product.ProductAdder(productList);


        Float totalPrice = productList.stream()
                .map(product -> product.price)
                .reduce(0.0f,(sum,price) -> sum+price);
        //totalPrice.
        System.out.println(totalPrice);


        float totalPrice2 = productList.stream()
                .map(product -> product.price)
                .reduce(0.0f,Float::sum);

        System.out.println(totalPrice2);

    }
}
