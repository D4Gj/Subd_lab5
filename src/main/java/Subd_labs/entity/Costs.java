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
public class Costs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String typeWork;

    private double sumPrices;
    @OneToMany
    private List<Orders> order;
    private String payMethod;

    @Override
    public String toString() {
        return "Costs {\n" +
                " id=" + id + ",\n" +
                " typework='" + typeWork + ",\n" +
                " sumprices=" + sumPrices + ",\n" +
                "paymethod=" + payMethod +
                "}" + "\n";
    }


}
