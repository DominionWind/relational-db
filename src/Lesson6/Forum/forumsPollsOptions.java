package Lesson6.Forum;

import java.util.Date;

public class forumsPollsOptions {
    private long ID;
    private forumPosts forumPost;
    private String title;
    private Date PollsOptionsDate;

    public forumsPollsOptions(long ID, forumPosts forumPost, String title, Date pollsOptionsDate) {
        this.ID = ID;
        this.forumPost = forumPost;
        this.title = title;
        PollsOptionsDate = pollsOptionsDate;
    }

    public long getID() {
        return ID;
    }

    public forumPosts getForumPost() {
        return forumPost;
    }

    public String getTitle() {
        return title;
    }

    public Date getPollsOptionsDate() {
        return PollsOptionsDate;
    }

//    ID NUMBER,
//    CONSTRAINT forumsPollsOptions_ID PRIMARY KEY(ID),
//    IDPost NUMBER,
//    CONSTRAINT IDPost_FK FOREIGN KEY (IDPost) REFERENCES forumPosts(ID)
//    title NVARCHAR2(64),
//    PollsOptionsDate TIMESTAMP
}
