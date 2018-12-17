package Lesson6.Forum;

import java.util.Date;

public class ForumSubcategories {
    private long ID;
    private ForumCategories forumCategory;
    private String title;
    private StringBuilder description;
    private Date ForumDate;
    private String ip;

    public ForumSubcategories(long ID, ForumCategories forumCategory, String title, StringBuilder description, Date forumDate, String ip) {
        this.ID = ID;
        this.forumCategory = forumCategory;
        this.title = title;
        this.description = description;
        ForumDate = forumDate;
        this.ip = ip;
    }

    public long getID() {
        return ID;
    }

    public ForumCategories getForumCategory() {
        return forumCategory;
    }

    public String getTitle() {
        return title;
    }

    public StringBuilder getDescription() {
        return description;
    }

    public Date getForumDate() {
        return ForumDate;
    }

    public String getIp() {
        return ip;
    }

//    ID NUMBER,
//    CONSTRAINT ForumSubcategories_ID PRIMARY KEY(ID),
//    IDCategory NUMBER,
//    CONSTRAINT ForumCategories_FK FOREIGN KEY(IDCategory) REFERENCES ForumCategories(ID),
//    title NVARCHAR2(45),
//    description CLOB,
//    ForumDate TIMESTAMP,
//    ip NVARCHAR2 (20)
}
