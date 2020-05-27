package Subd_labs.service.implementation;

import Subd_labs.entity.Costs;
import Subd_labs.repository.CostsRepository;
import Subd_labs.service.serviceInterfaces.CostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CostsServiceImpl implements CostsService {
    @Autowired
    private CostsRepository costsRepository;
    @Override
    public Costs addCosts(Costs Costs){
        Costs savedCosts = costsRepository.saveAndFlush(Costs);
        return savedCosts;
    }
    @Override
    public void delete(int id){
        costsRepository.deleteById(id);
    }
    @Override
    public Optional<Costs> getById(int id){
        return costsRepository.findById(id);
    }
    @Override
    public Costs editCosts(Costs Costs){
        return costsRepository.saveAndFlush(Costs);
    }
    @Override
    public List<Costs> getAll() {
        return costsRepository.findAll();
    }
}
