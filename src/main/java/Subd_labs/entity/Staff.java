package Subd_labs.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

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

    private BigInteger phoneNum;

    private Double perks;
    public Staff(){
    }
    public Staff(Integer id, String name, String surname, String patronymic, BigInteger phonenum){
    this.name=name;
    this.surname=surname;
    this.patronymic=patronymic;
    this.phoneNum =phonenum;
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
                " phonenum=" + phoneNum + ",\n" +
                " perks=" + perks +
                "}" + "\n";
    }
}
