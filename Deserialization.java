import java.io.*;
public class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;
    public static void main(String[] args) {
        try {
            Product product = new Product(1, "Phone", "Electronics", 999.99);
            FileOutputStream fileOut = new FileOutputStream("product.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(product);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in product.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
        try {
            FileInputStream fileIn = new FileInputStream("product.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Product product = (Product) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized Product:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Product class not found");
            c.printStackTrace();
        }
    }
}
       
      
