package Lesson6.Forum;

import java.util.Date;

public class Users {
    private long ID;
    private String nick;
    private String password;
    private String email;
    private Date UserDate;
    private double karma;
    private String ip;

    public Users(long ID, String nick, String password, String email, Date userDate, double karma, String ip) {
        this.ID = ID;
        this.nick = nick;
        this.password = password;
        this.email = email;
        UserDate = userDate;
        this.karma = karma;
        this.ip = ip;
    }

    public long getID() {
        return ID;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Date getUserDate() {
        return UserDate;
    }

    public double getKarma() {
        return karma;
    }

    public String getIp() {
        return ip;
    }

//    ID NUMBER,
//    CONSTRAINT Users_ID PRIMARY KEY(ID),
//    nick NVARCHAR2(16),
//    pasword NVARCHAR2(128),
//    email NVARCHAR2(128),
//    UserdDate TIMESTAMP,
//    karma DECIMAL(9,2),
//    ip NVARCHAR2 (20)
}
