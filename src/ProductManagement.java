import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private static final String FILE_PATH = "products.txt";
    private List<Product> products;
    public ProductManagement(){
        products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void displayProducts(){
        for (Product product : products){
            System.out.println(product);
        }
    }
    public Product searchProduct(String code){
        for (Product product : products){
            if (product.getCode().equals(code)){
                return product;
            }
        }
        return null;
    }
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile() {
        }
    }

