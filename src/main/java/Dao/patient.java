package Dao;

import javax.persistence.*;
import java.util.Date;

@Entity
public class patient  {
    @Id
    private String username;
    private String password;
    private String IDcards;
    private String Nname;
    private boolean sex;
    private int state;
    private Date time;
    private String type;
    private int mark;
    private String plan;

    public patient() {
        mark  = 0;
        time.setTime(System.currentTimeMillis());
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIDcards() {
        return IDcards;
    }

    public String getNname() {
        return Nname;
    }

    public boolean isSex() {
        return sex;
    }

    public int getState() {
        return state;
    }

    public Date getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public int getMark() {
        return mark;
    }

    public String getPlan() {
        return plan;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIDcards(String IDcards) {
        this.IDcards = IDcards;
    }

    public void setNname(String nname) {
        Nname = nname;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

}
