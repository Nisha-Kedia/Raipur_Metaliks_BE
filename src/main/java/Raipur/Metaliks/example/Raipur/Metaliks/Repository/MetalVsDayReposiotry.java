package Raipur.Metaliks.example.Raipur.Metaliks.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Raipur.Metaliks.example.Raipur.Metaliks.Entity.MetalVsDay;

public interface MetalVsDayReposiotry  extends JpaRepository<MetalVsDay, Long> {
    
    
    @Query(nativeQuery = true, value="SELECT * FROM metal_vs_day")
    List<MetalVsDay> getAllMetalVsDayRecords();
    
    @Query(nativeQuery = true, value="SELECT * FROM metal_vs_day WHERE date = ?1 AND metal_type = ?2")
    List<MetalVsDay> findByDateAndMetalType(String date, String metalType);

    

}
