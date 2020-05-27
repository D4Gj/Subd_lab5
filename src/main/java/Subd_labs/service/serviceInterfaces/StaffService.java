package Subd_labs.service.serviceInterfaces;

import Subd_labs.entity.Staff;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface StaffService {
    Staff addStaff(Staff staff);
    void delete(int id);
    Optional<Staff> getById(int id);
    Staff editStaff(Staff staff);
    List<Staff> getAll();
}
