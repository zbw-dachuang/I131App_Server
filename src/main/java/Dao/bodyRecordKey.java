package Dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
public class bodyRecordKey implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String username;
    @Id
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;
    private double T3;
    private double T4;
    private double FSH;
    private double FT3;
    private double FT4;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bodyRecordKey that = (bodyRecordKey) o;
        return time == that.time &&
                Objects.equals(username, that.username) &&
                Objects.equals(T3, that.T3) &&
                Objects.equals(T4, that.T4) &&
                Objects.equals(FT3, that.FT3) &&
                Objects.equals(FT4, that.FT4) &&
                Objects.equals(FSH, that.FSH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, time,T3,T4,FSH,FT3,FT4);
    }
}
