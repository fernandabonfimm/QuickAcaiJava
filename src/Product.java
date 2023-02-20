import java.util.ArrayList;

public class Product {
    private String idProduct;
    private String name;
    private String description;
    private String price;
    private Number ml;
    private ArrayList<String> ingredients;

    public Product(String idProduct, String name, String description, String price, Number ml,
            ArrayList<String> ingredients) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.price = price;
        this.ml = ml;
        this.ingredients = ingredients;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public Number getMl() {
        return ml;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setMl(Number ml) {
        this.ml = ml;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

}
