package Subd_labs.service.serviceInterfaces;

import Subd_labs.entity.Donework;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface DoneworkService {
    Donework addDonework(Donework donework);
    void delete(int id);
    Optional<Donework> getById(int id);
    Donework editDonework(Donework donework);
    List<Donework> getAll();
}
