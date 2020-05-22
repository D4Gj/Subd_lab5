package Subd_labs.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Donework {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany
    private List<Staff> staff;

    @ManyToOne
    private Orders Orders;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String typework;

    private Double price;

    @Override
    public String toString() {
        return "Donework {\n" +
                " id=" + id + ",\n" +
                " typework=" + typework + ",\n" +
                " price=" + price +
                "}" + "\n";
    }

}
