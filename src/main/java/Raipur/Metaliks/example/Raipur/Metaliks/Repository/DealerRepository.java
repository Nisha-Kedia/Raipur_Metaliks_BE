package Raipur.Metaliks.example.Raipur.Metaliks.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Long>{
    @Query(nativeQuery = true, value="SELECT * FROM dealer")
    List<Dealer> getallDealers();
}
