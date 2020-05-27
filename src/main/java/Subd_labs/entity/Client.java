package Subd_labs.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String surname;

    private String patronymic;

    private BigInteger phoneNum;

    @OneToMany
    private List<Orders> Orders;

    @Override
    public String toString() {
        return "Client {" + "\n" +
                " id=" + id + ",\n" +
                " name='" + name + ",\n" +
                " surname='" + surname + ",\n" +
                " patronymic=" + patronymic + ",\n"+
                " phonenum=" + phoneNum + ",\n"+
                "}\n";
    }
}
