package Lesson6.Products;

public class Categories {
    private long ID;
    private String CategoryName;
    private String Description;
    private String Picture;

    public Categories(long ID, String categoryName, String description, String picture) {
        this.ID = ID;
        CategoryName = categoryName;
        Description = description;
        Picture = picture;
    }

    public long getID() {
        return ID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public String getDescription() {
        return Description;
    }

    public String getPicture() {
        return Picture;
    }

//    ID NUMBER,
//    CONSTRAINT CATEGORY_ID PRIMARY KEY(ID),
//    CategoryName NVARCHAR2(20) NOT NULL,
//    Description NVARCHAR2(20),
//    Picture NVARCHAR2(30)
}
