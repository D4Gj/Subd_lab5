package Subd_labs.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class GetAllTypeWork {
    private String nameTypeWork;

    public String getNameTypeWork() {
        return nameTypeWork;
    }
}
