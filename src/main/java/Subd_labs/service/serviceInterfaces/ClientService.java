package Subd_labs.service.serviceInterfaces;
import Subd_labs.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ClientService {
    Client addClient(Client client);
    void delete(int id);
    Optional<Client> getById(int id);
    Client editClient(Client bank);
    List<Client> getAll();
}
