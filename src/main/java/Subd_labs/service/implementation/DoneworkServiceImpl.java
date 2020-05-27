package Subd_labs.service.implementation;

import Subd_labs.entity.Donework;
import Subd_labs.repository.DoneworkRepository;
import Subd_labs.service.serviceInterfaces.DoneworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoneworkServiceImpl implements DoneworkService {
    @Autowired
    private DoneworkRepository doneworkRepository;
    @Override
    public Donework addDonework(Donework donework){
        Donework savedDonework = doneworkRepository.saveAndFlush(donework);
        return savedDonework;
    }
    @Override
    public void delete(int id){
        doneworkRepository.deleteById(id);
    }
    @Override
    public Optional<Donework> getById(int id){
        return doneworkRepository.findById(id);
    }
    @Override
    public Donework editDonework(Donework donework){
        return doneworkRepository.saveAndFlush(donework);
    }
    @Override
    public List<Donework> getAll() {
        return doneworkRepository.findAll();
    }
}
