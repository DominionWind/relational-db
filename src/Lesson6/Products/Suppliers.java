package Lesson6.Products;

public class Suppliers {
    private long ID;
    private String CompanyName;
    private String ContactName;
    private String ContaqctTitle;
    private String Adress;
    private String City;
    private String Region;
    private int PostalCode;
    private String Phone;
    private String Fax;
    private String HomePage;

    public Suppliers(long ID, String companyName, String contactName, String contaqctTitle, String adress, String city,
                     String region, int postalCode, String phone, String fax, String homePage) {
        this.ID = ID;
        CompanyName = companyName;
        ContactName = contactName;
        ContaqctTitle = contaqctTitle;
        Adress = adress;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Phone = phone;
        Fax = fax;
        HomePage = homePage;
    }

    public long getID() {
        return ID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public String getContaqctTitle() {
        return ContaqctTitle;
    }

    public String getAdress() {
        return Adress;
    }

    public String getCity() {
        return City;
    }

    public String getRegion() {
        return Region;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public String getPhone() {
        return Phone;
    }

    public String getFax() {
        return Fax;
    }

    public String getHomePage() {
        return HomePage;
    }

    //    ID NUMBER,
//    CONSTRAINT SUPPLIER_ID PRIMARY KEY(ID),
//    CompanyName NVARCHAR2(20) NOT NULL,
//    ContactName NVARCHAR2(20),
//    ContaqctTitle NVARCHAR2(100),
//    Adress NVARCHAR2(20),
//    City NVARCHAR2(20),
//    Region NVARCHAR2(20),
//    PostalCode NUMBER(5),
//    Country NVARCHAR2(20),
//    Phone NVARCHAR2(20),
//    Fax NVARCHAR2(20),
//    HomePage NVARCHAR2(30)
}
