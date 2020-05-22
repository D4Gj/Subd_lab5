package Subd_labs.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Costs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String typework;

    private double sumprices;
    @OneToMany
    private List<Orders> order;
    private String paymethod;

    @Override
    public String toString() {
        return "Costs {\n" +
                " id=" + id + ",\n" +
                " typework='" + typework + ",\n" +
                " Sumprices=" +  sumprices + ",\n" +
                "paymethod=" + paymethod +
                "}" + "\n";
    }


}
