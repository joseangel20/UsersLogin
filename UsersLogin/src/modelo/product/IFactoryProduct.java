package modelo.product;

public interface IFactoryProduct {
    Product product(String name, String mark, String category, float price,
            int stock);
   
    Product product(int idProduct, String name, String mark, String category, 
            float price, int stock);
}
