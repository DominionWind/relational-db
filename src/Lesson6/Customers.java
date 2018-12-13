package Lesson6;

import java.util.Date;

public class Customers {
    private long ID;
    private String CompanyName;
    private String ContactName;
    private Date ContactTime;
    private String Adress;
    private String City;
    private String Region;
    private int PostalCode;
    private String Country;
    private String Phone;
    private String Fax;

    public Customers(long ID, String companyName, String contactName, Date contactTime, String adress, String city,
                     String region, int postalCode, String country, String phone, String fax) {
        this.ID = ID;
        CompanyName = companyName;
        ContactName = contactName;
        ContactTime = contactTime;
        Adress = adress;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Country = country;
        Phone = phone;
        Fax = fax;
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

    public Date getContactTime() {
        return ContactTime;
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

    public String getCountry() {
        return Country;
    }

    public String getPhone() {
        return Phone;
    }

    public String getFax() {
        return Fax;
    }

    //    CREATE TABLE Customers(
//            ID NUMBER,
//            CONSTRAINT Customer_ID PRIMARY KEY(ID),
//    CompanyName NVARCHAR2(30) NOT NULL,
//    ContactName NVARCHAR2(30),
//    ContactTime TIMESTAMP,
//    Adress NVARCHAR2(20),
//    City NVARCHAR2(20),
//    Region NVARCHAR2(20),
//    PostalCode NUMBER(5),
//    Country NVARCHAR2(20),
//    Phone NVARCHAR2(20),
//    Fax NVARCHAR2(20)
//);
}
