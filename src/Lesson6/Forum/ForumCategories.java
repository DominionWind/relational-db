package Lesson6.Forum;

import java.util.Date;

public class ForumCategories {
    private long ID;
    private String title;
    private StringBuilder description;
    private Date ForumDate;
    private String ip;

    public ForumCategories(long ID, String title, StringBuilder description, Date forumDate, String ip) {
        this.ID = ID;
        this.title = title;
        this.description = description;
        ForumDate = forumDate;
        this.ip = ip;
    }

    public long getID() {
        return ID;
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
//    CONSTRAINT ForumCategories_ID PRIMARY KEY(ID),
//    title NVARCHAR2(64),
//    description CLOB,
//    ForumDate TIMESTAMP,
//    ip NVARCHAR2 (20)
}
