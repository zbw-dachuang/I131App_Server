package Dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Setter
@Getter
@IdClass(bodyRecordKey.class)
public class bodyRecord {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String username;
    @Id
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;
    private double T3;
    private double T4;
    private double TSH;
    private double FT3;
    private double FT4;
}
