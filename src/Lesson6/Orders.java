package Lesson6;

import java.util.Date;

public class Orders {
    private long ID;
    private Customers customer;
    private Employees employee;
    private Date OrderDate;
    private Date RequiredDate;
    private Date TIMESTAMP;
    private String ShipVIA;
    private String Freight;
    private String ShipName;
    private String ShipAdress;
    private String ShipCity;
    private String ShipRegion;
    private int ShipPostalCode;
    private String ShipCountry;

    public Orders(long ID, Customers customer, Employees employee, Date orderDate, Date requiredDate, Date TIMESTAMP,
                  String shipVIA, String freight, String shipName, String shipAdress, String shipCity,
                  String shipRegion, int shipPostalCode, String shipCountry) {
        this.ID = ID;
        this.customer = customer;
        this.employee = employee;
        OrderDate = orderDate;
        RequiredDate = requiredDate;
        this.TIMESTAMP = TIMESTAMP;
        ShipVIA = shipVIA;
        Freight = freight;
        ShipName = shipName;
        ShipAdress = shipAdress;
        ShipCity = shipCity;
        ShipRegion = shipRegion;
        ShipPostalCode = shipPostalCode;
        ShipCountry = shipCountry;
    }

    public long getID() {
        return ID;
    }

    public Customers getCustomer() {
        return customer;
    }

    public Employees getEmployee() {
        return employee;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public Date getRequiredDate() {
        return RequiredDate;
    }

    public Date getTIMESTAMP() {
        return TIMESTAMP;
    }

    public String getShipVIA() {
        return ShipVIA;
    }

    public String getFreight() {
        return Freight;
    }

    public String getShipName() {
        return ShipName;
    }

    public String getShipAdress() {
        return ShipAdress;
    }

    public String getShipCity() {
        return ShipCity;
    }

    public String getShipRegion() {
        return ShipRegion;
    }

    public int getShipPostalCode() {
        return ShipPostalCode;
    }

    public String getShipCountry() {
        return ShipCountry;
    }

    //    ID NUMBER,
//    CONSTRAINT ORDER_ID PRIMARY KEY(ID),
//    CustomerID NUMBER,
//    CONSTRAINT Customer_FK FOREIGN KEY(CustomerID) REFERENCES Customers(ID),
//    EmployeeID NUMBER,
//    CONSTRAINT Employee_FK FOREIGN KEY(EmployeeID) REFERENCES Employees(ID),
//    OrderDate TIMESTAMP,
//    RequiredDate TIMESTAMP,
//    ShippedDate TIMESTAMP,
//    ShipVIA NVARCHAR2(20),
//    Freight NVARCHAR2(20),
//    ShipName NVARCHAR2(20),
//    ShipAdress NVARCHAR2(20),
//    ShipCity NVARCHAR2(20),
//    ShipRegion NVARCHAR2(20),
//    ShipPostalCode NUMBER(5),
//    ShipCountry NVARCHAR2(20)
}
