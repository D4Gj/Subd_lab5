package Subd_labs.service.serviceInterfaces;

import Subd_labs.entity.Firm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface FirmService {
    Firm addFirm(Firm firm);
    void delete(int id);
    Optional<Firm> getById(int id);
    Firm editFirm(Firm firm);
    List<Firm> getAll();
}
