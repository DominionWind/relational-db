package Lesson6.Forum;

import java.util.Date;

public class forumsPollsOptionsVotes {
    private long ID;
    private forumsPollsOptions forumsPollsOption;
    private Users user;
    private Date PollsOptionsVotesDate;
    private String ip;

    public forumsPollsOptionsVotes(long ID, forumsPollsOptions forumsPollsOption, Users user, Date pollsOptionsVotesDate, String ip) {
        this.ID = ID;
        this.forumsPollsOption = forumsPollsOption;
        this.user = user;
        PollsOptionsVotesDate = pollsOptionsVotesDate;
        this.ip = ip;
    }

    public long getID() {
        return ID;
    }

    public forumsPollsOptions getForumsPollsOption() {
        return forumsPollsOption;
    }

    public Users getUser() {
        return user;
    }

    public Date getPollsOptionsVotesDate() {
        return PollsOptionsVotesDate;
    }

    public String getIp() {
        return ip;
    }

//    ID NUMBER,
//    CONSTRAINT forumsPollsOptionsVotes_ID PRIMARY KEY(ID),
//    IDPoolOption NUMBER,
//    CONSTRAINT IDPoolOption_FK FOREIGN KEY(IDPoolOption) REFERENCES forumsPollsOptions(ID),
//    IDUser NUMBER,
//    CONSTRAINT IDUser_FK FOREIGN KEY (IDUser) REFERENCES Users(ID),
//    PollsOptionsVotesDate TIMESTAMP,
//    ip NVARCHAR2 (20)
}
