package Subd_labs.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Costs costs;
    @ManyToOne
    private Client client;
    @OneToMany
    private List<Donework> Doneworks;

    private Date date;

    public String toString(){
        return "Orders {" + "\n" +
                " id=" + id + ",\n" +
                " client='" + client + ",\n" +
                " costs" + costs  +
                " date='" + date + ",\n" +
                "}\n";
    }
}
