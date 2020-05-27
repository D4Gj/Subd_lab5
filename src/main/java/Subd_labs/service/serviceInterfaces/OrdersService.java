package Subd_labs.service.serviceInterfaces;

import Subd_labs.entity.Orders;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface OrdersService {
    Orders addOrders(Orders orders);
    void delete(int id);
    Optional<Orders> getById(int id);
    Orders editOrders(Orders orders);
    List<Orders> getAll();
}
