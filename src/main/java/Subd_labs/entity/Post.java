package Subd_labs.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String postname;
    @OneToMany
    private List<Staff> staff;

    private Double salary;

    public String toString(){
        return "Orders {" + "\n" +
                " id=" + id + ",\n" +
                " postname=" + postname + ",\n" +
                " salary=" + salary + ",\n" +
                "}\n";
    }
}
