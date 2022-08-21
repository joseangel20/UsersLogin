package modelo.product;

public class Product extends AbstractProduct {

    private int idProduct;

    public Product(int idProduct, String name, String mark, String category, 
            float price, int stock) {
        super(name, mark, category, price, stock);
        this.idProduct = idProduct;
    }

    public Product(String name, String mark, String category,float price,int stock) {
        super(name, mark, category, price, stock);
    }

    public int getIdProduct() {
        return idProduct;
    }
}
