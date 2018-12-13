package Lesson6;

public class Shippers {
    private long ID;
    private String CompanyName;
    private String Phone;

    public Shippers(long ID, String companyName, String phone) {
        this.ID = ID;
        CompanyName = companyName;
        Phone = phone;
    }

    public long getID() {
        return ID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getPhone() {
        return Phone;
    }

//    CREATE TABLE SHIPPERS
//            (
//    ID NUMBER,
//    CONSTRAINT SHIPPER_ID PRIMARY KEY(ID),
//    CompanyName NVARCHAR2(30) NOT NULL,
//    Phone NVARCHAR2(20)
//    );
}
