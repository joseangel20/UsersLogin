package modelo.product;

public class FactoryProduct implements IFactoryProduct {

   @Override
    public Product product(String name, String mark, String category, 
            float price, int stock) {
        return new Product(name, mark, category, price, stock);
    }
   @Override
    public Product product(int idProduct, String name, String mark, 
            String category, float price, int stock) {
        return new Product(idProduct, name, mark, category, price, stock);
    }
}
