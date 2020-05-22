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
public class Firm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firm_name;

    private String startOfWorking;

    private String endOfWorking;

    private String address;

    private String directorFullname;

    @OneToMany
    private List<Staff> staff;

    public String toString() {
        return "Firm {\n" +
                " id=" + id + ",\n" +
                " firmname=" + firm_name + ",\n" +
                " startOfWorking=" + startOfWorking + ",\n" +
                " endOfWorking=" + endOfWorking + ",\n" +
                " address=" + address + ",\n" +
                " directorFullname=" + directorFullname + ",\n" +
                "}" + "\n";
    }
}
