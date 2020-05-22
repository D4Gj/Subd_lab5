package Subd_labs.repository;

import Subd_labs.entity.Clients;
import Subd_labs.entity.Orders;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    @Query("select new Subd_labs.repository.LastMonthRecord(ord.id,ord.date,c.name,c.surname) from Orders ord JOIN Clients c on ord.clients=c where ord.date<=current_date and ord.date>=:date")
    List<LastMonthRecord> findDate(Date date);
}
