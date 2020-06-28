package Dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class CheckContent {
    @Id
    private String number;
    private int state;
    private String text;
}
