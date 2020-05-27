package Subd_labs.service.implementation;

import Subd_labs.entity.Firm;
import Subd_labs.repository.FirmRepository;
import Subd_labs.service.serviceInterfaces.FirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FirmServiceImpl implements FirmService {
    @Autowired
    private FirmRepository firmRepository;
    @Override
    public Firm addFirm(Firm firm){
        Firm savedFirm = firmRepository.saveAndFlush(firm);
        return savedFirm;
    }
    @Override
    public void delete(int id){
        firmRepository.deleteById(id);
    }
    @Override
    public Optional<Firm> getById(int id){
        return firmRepository.findById(id);
    }
    @Override
    public Firm editFirm(Firm firm){
        return firmRepository.saveAndFlush(firm);
    }
    @Override
    public List<Firm> getAll() {
        return firmRepository.findAll();
    }
}
