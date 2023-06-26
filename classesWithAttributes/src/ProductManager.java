public class ProductManager {
    public void Add(Product product){
        System.out.println("Product added " + product.getName());

    }
    public void Price(Product product){
        System.out.println("Price of product is : " + product.getPrice());
    }
}
