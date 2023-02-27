package classes.order;

public class Order {
    private String idOrder;
    private String idClient;
    private String idProduct;
    private String idSeller;
    private String date;
    private String status;
    private String paymentMethod;
    private String paymentStatus;

    public Order(String idOrder, String idClient, String idProduct, String idSeller, String date, String status,
            String paymentMethod, String paymentStatus) {
        this.idOrder = idOrder;
        this.idClient = idClient;
        this.idProduct = idProduct;
        this.idSeller = idSeller;
        this.date = date;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public String getIdClient() {
        return idClient;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public String getIdSeller() {
        return idSeller;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public void setIdSeller(String idSeller) {
        this.idSeller = idSeller;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
