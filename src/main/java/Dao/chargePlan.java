package Dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Setter
@Getter
public class chargePlan {
    @Id
    private String username;
    @Id
    private String workNumber;
    private Date time;
    private String content;

}
