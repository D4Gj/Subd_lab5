package Subd_labs.repository;

import Subd_labs.entity.Donework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoneworkRepository extends JpaRepository<Donework, Integer> {
}
