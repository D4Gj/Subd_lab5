package Subd_labs.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.print.DocFlavor;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class LastMonthRecord {
    private int id;
    private Date date;
    private String firstName;
    private String lastName;

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
