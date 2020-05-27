package Subd_labs.service.serviceInterfaces;
import Subd_labs.entity.Costs;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface CostsService {
    Costs addCosts(Costs costs);
    void delete(int id);
    Optional<Costs> getById(int id);
    Costs editCosts(Costs costs);
    List<Costs> getAll();
}
