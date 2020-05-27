package Subd_labs.service.implementation;

import Subd_labs.entity.Staff;
import Subd_labs.repository.StaffRepository;
import Subd_labs.service.serviceInterfaces.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepository staffRepository;
    @Override
    public Staff addStaff(Staff staff){
        Staff savedStaff = staffRepository.saveAndFlush(staff);
        return savedStaff;
    }
    @Override
    public void delete(int id){
        staffRepository.deleteById(id);
    }
    @Override
    public Optional<Staff> getById(int id){
        return staffRepository.findById(id);
    }
    @Override
    public Staff editStaff(Staff staff){
        return staffRepository.saveAndFlush(staff);
    }
    @Override
    public List<Staff> getAll() {
        return staffRepository.findAll();
    }
}
