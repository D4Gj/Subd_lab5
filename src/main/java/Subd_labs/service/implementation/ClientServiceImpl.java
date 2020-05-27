package Subd_labs.service.implementation;

import Subd_labs.entity.Client;
import Subd_labs.repository.ClientRepository;
import Subd_labs.service.serviceInterfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client addClient(Client client){
        Client savedClient = clientRepository.saveAndFlush(client);
        return savedClient;
    }
    @Override
    public void delete(int id){
        clientRepository.deleteById(id);
    }
    @Override
    public Optional<Client> getById(int id){
        return clientRepository.findById(id);
    }
    @Override
    public Client editClient(Client client){
        return clientRepository.saveAndFlush(client);
    }
    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
