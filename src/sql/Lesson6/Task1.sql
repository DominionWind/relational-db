CREATE TABLE SHIPPERS
(
    ID NUMBER,
    CONSTRAINT SHIPPER_ID PRIMARY KEY(ID),
    CompanyName NVARCHAR2(30) NOT NULL,
    Phone NVARCHAR2(20)
);

CREATE TABLE Customers(
    ID NUMBER,
    CONSTRAINT Customer_ID PRIMARY KEY(ID),
    CompanyName NVARCHAR2(30) NOT NULL,
    ContactName NVARCHAR2(30),
    ContactTime TIMESTAMP,
    Adress NVARCHAR2(20),
    City NVARCHAR2(20),
    Region NVARCHAR2(20),
    PostalCode NUMBER(5),
    Country NVARCHAR2(20),
    Phone NVARCHAR2(20),
    Fax NVARCHAR2(20)
);

CREATE TABLE Employees(
    ID NUMBER,
    CONSTRAINT Employee_ID PRIMARY KEY(ID),
    LastName NVARCHAR2(20) NOT NULL,
    FirstName NVARCHAR2(20) NOT NULL,
    Title NVARCHAR2(100),
    TitleOfCourtesy NVARCHAR2(100),
    BirthDate TIMESTAMP,
    HireDate TIMESTAMP,
    Adress NVARCHAR2(20),
    City NVARCHAR2(20),
    Region NVARCHAR2(20),
    PostalCode NUMBER(5),
    Country NVARCHAR2(20),
    HomePhone NVARCHAR2(20),
    Extension NVARCHAR2(20),
    Photo NVARCHAR2(30),
    Notes NVARCHAR2(100),
    ReportsTo NVARCHAR2(30)
);

CREATE TABLE Orders(
    ID NUMBER,
    CONSTRAINT ORDER_ID PRIMARY KEY(ID),
    CustomerID NUMBER,
    CONSTRAINT Customer_FK FOREIGN KEY(CustomerID) REFERENCES Customers(ID),
    EmployeeID NUMBER,
    CONSTRAINT Employee_FK FOREIGN KEY(EmployeeID) REFERENCES Employees(ID),
    OrderDate TIMESTAMP,
    RequiredDate TIMESTAMP,
    ShippedDate TIMESTAMP,
    ShipVIA NVARCHAR2(20),
    Freight NVARCHAR2(20),
    ShipName NVARCHAR2(20),
    ShipAdress NVARCHAR2(20),
    ShipCity NVARCHAR2(20),
    ShipRegion NVARCHAR2(20),
    ShipPostalCode NUMBER(5),
    ShipCountry NVARCHAR2(20)
);

CREATE TABLE Suppliers(
    ID NUMBER,
    CONSTRAINT SUPPLIER_ID PRIMARY KEY(ID),
    CompanyName NVARCHAR2(20) NOT NULL,
    ContactName NVARCHAR2(20),
    ContaqctTitle NVARCHAR2(100),
    Adress NVARCHAR2(20),
    City NVARCHAR2(20),
    Region NVARCHAR2(20),
    PostalCode NUMBER(5),
    Country NVARCHAR2(20),
    Phone NVARCHAR2(20),
    Fax NVARCHAR2(20),
    HomePage NVARCHAR2(30)
);

CREATE TABLE Categories(
    ID NUMBER,
    CONSTRAINT CATEGORY_ID PRIMARY KEY(ID),
    CategoryName NVARCHAR2(20) NOT NULL,
    Description NVARCHAR2(20),
    Picture NVARCHAR2(30)
);

CREATE TABLE Products(
    ID NUMBER,
    CONSTRAINT Product_ID PRIMARY KEY(ID),
    ProductName NVARCHAR2 (30) NOT NULL,
    SuppliersID NUMBER,
    CONSTRAINT Supplier_FK FOREIGN KEY(SuppliersID) REFERENCES Suppliers(ID),
    CategoryID NUMBER,
    CONSTRAINT Category_FK FOREIGN KEY(CategoryID) REFERENCES Categories(ID),
    QuantityPerUnit NUMBER,
    UnipPricy NUMBER,
    UnitsInStock NUMBER,
    UnitsOnOrder NUMBER,
    ReorderLevel NUMBER,
    Discontinued NVARCHAR2 (30)
);

CREATE TABLE OrderDetails(
    OrderID NUMBER,
    CONSTRAINT Order_FK FOREIGN KEY(OrderID) REFERENCES Orders(ID),
    ProductID NUMBER NOT NULL,
    CONSTRAINT Product_FK FOREIGN KEY(ProductID) REFERENCES Products(ID),
    UnitPrice NUMBER NOT NULL,
    Quantity NUMBER NOT NULL,
    Discount NUMBER NOT NULL
);