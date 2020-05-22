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
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Donework donework;

    @ManyToOne
    private Firm firm;

    @ManyToOne
    private Post post;

    private String name;

    private String surname;

    private String patronymic;

    private BigInteger phonenum;

    private Double perks;

    public Staff(){}

    public void Construct(Integer id,String name, String surname,String patronymic, BigInteger phonenum){
    this.name=name;
    this.surname=surname;
    this.patronymic=patronymic;
    this.phonenum=phonenum;
    }

    public String toString() {
        return "Staff {\n" +
                " id=" + id + ",\n" +
                " name='" + name + ",\n" +
                " surname='" + surname + ",\n" +
                " patronymic=" + patronymic + ",\n"+
                " donework=" + donework + ",\n"+
                " firm=" + firm + ",\n"+
                " post=" + post + ",\n"+
                " phonenum=" +  phonenum + ",\n" +
                " perks=" + perks +
                "}" + "\n";
    }
}
