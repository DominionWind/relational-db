package Lesson6;

public class OrderDetails {
    private long ID;
    private Products product;
    private int UnitPrice;
    private int Quantity;
    private int Discount;

    public OrderDetails(long ID, Products product, int unitPrice, int quantity, int discount) {
        this.ID = ID;
        this.product = product;
        UnitPrice = unitPrice;
        Quantity = quantity;
        Discount = discount;
    }

    public long getID() {
        return ID;
    }

    public Products getProduct() {
        return product;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getDiscount() {
        return Discount;
    }

//    OrderID NUMBER,
//    CONSTRAINT Order_FK FOREIGN KEY(OrderID) REFERENCES Orders(ID),
//    ProductID NUMBER NOT NULL,
//    CONSTRAINT Product_FK FOREIGN KEY(ProductID) REFERENCES Products(ID),
//    UnitPrice NUMBER NOT NULL,
//    Quantity NUMBER NOT NULL,
//    Discount NUMBER NOT NULL
}
