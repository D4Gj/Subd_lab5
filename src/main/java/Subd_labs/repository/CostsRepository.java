package Subd_labs.repository;
import Subd_labs.entity.Costs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostsRepository extends JpaRepository<Costs, Integer> {
    @Query("SELECT new Subd_labs.repository.AllTypeWork(cost.typeWork) FROM Costs cost")
    List<AllTypeWork> getAllTypeWork();

    @Query("Select new Subd_labs.repository.CostsTypeworkSum(cost.typeWork,cost.sumPrices) from Costs cost")
    public List<CostsTypeworkSum> getAllTypeWorkSums();
}
