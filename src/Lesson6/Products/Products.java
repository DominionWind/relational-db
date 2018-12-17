package Lesson6.Products;

public class Products {
    private long ID;
    private String ProductName;
    private Suppliers supplier;
    private Categories category;
    private int QuantityPerUnit;
    private int UnipPricy;
    private int UnitsInStock;
    private int UnitsOnOrder;
    private int ReorderLevel;
    private String Discontinued;

    public Products(long ID, String productName, Suppliers supplier, Categories category, int quantityPerUnit,
                    int unipPricy, int unitsInStock, int unitsOnOrder, int reorderLevel, String discontinued) {
        this.ID = ID;
        ProductName = productName;
        this.supplier = supplier;
        this.category = category;
        QuantityPerUnit = quantityPerUnit;
        UnipPricy = unipPricy;
        UnitsInStock = unitsInStock;
        UnitsOnOrder = unitsOnOrder;
        ReorderLevel = reorderLevel;
        Discontinued = discontinued;
    }

    public long getID() {
        return ID;
    }

    public String getProductName() {
        return ProductName;
    }

    public Suppliers getSupplier() {
        return supplier;
    }

    public Categories getCategory() {
        return category;
    }

    public int getQuantityPerUnit() {
        return QuantityPerUnit;
    }

    public int getUnipPricy() {
        return UnipPricy;
    }

    public int getUnitsInStock() {
        return UnitsInStock;
    }

    public int getUnitsOnOrder() {
        return UnitsOnOrder;
    }

    public int getReorderLevel() {
        return ReorderLevel;
    }

    public String getDiscontinued() {
        return Discontinued;
    }

    //    ID NUMBER,
//    CONSTRAINT Product_ID PRIMARY KEY(ID),
//    ProductName NVARCHAR2 (30) NOT NULL,
//    SuppliersID NUMBER,
//    CONSTRAINT Supplier_FK FOREIGN KEY(SuppliersID) REFERENCES Suppliers(ID),
//    CategoryID NUMBER,
//    CONSTRAINT Category_FK FOREIGN KEY(CategoryID) REFERENCES Categories(ID),
//    QuantityPerUnit NUMBER,
//    UnipPricy NUMBER,
//    UnitsInStock NUMBER,
//    UnitsOnOrder NUMBER,
//    ReorderLevel NUMBER,
//    Discontinued NVARCHAR2 (30)
}
