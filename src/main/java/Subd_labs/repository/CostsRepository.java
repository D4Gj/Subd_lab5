package Subd_labs.repository;
import Subd_labs.entity.Costs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostsRepository extends JpaRepository<Costs, Integer> {
    @Query("SELECT new Subd_labs.repository.GetAllTypeWork(cost.typework) FROM Costs cost")
    List<GetAllTypeWork> getAllTypeWork();

    @Query("Select new Subd_labs.repository.CostsTypeworkSum(cost.typework,cost.sumprices) from Costs cost")
    List<CostsTypeworkSum> getAllTypeWorkSums();
}
