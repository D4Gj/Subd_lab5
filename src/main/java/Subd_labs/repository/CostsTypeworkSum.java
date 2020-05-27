package Subd_labs.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class CostsTypeworkSum {
    private String typeworkName;
    private double sumPrices;

    public String getTypeworkName() {
        return typeworkName;
    }

    public double getSumprices() {
        return sumPrices;
    }
}
