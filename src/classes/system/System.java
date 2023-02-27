package classes.system;

import classes.administrator.Administrator;
import classes.client.Client;
import classes.order.Order;
import classes.product.Product;

public class System {

    public static void main(String[] args) {
        Client newClient;
        Product newProduct;
        Order newOrder;
        Administrator newAdministrator;

        newClient = new Client("Fernanda", "Pontal", "16 991313277", "fernanda@gmail.com", "001", "senha123");
        newProduct = new Product("001", "Café", "Café de qualidade", "R$ 10,00", 100, "Café, água, açúcar");
        newOrder = new Order("001", "Café", "R$ 10,00", "Fernanda", "16 991313277", "ativo", "creditCard", "aproved");
        newAdministrator = new Administrator("Fernanda", "Pontal", "16 991313277", 001);
    }
}
