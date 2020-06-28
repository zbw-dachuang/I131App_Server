package Dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class dailyRecord {
    @Id
    private String username;
    @Id
    private Date time;
    private int temperature;
    private int HighPressure;
    private int LowPressure;
    private  String Defecate;
    private double BloodSuger;
}
