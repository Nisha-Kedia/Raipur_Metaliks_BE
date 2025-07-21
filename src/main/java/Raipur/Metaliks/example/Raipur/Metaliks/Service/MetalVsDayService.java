package Raipur.Metaliks.example.Raipur.Metaliks.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Raipur.Metaliks.example.Raipur.Metaliks.DTO.MetalVsDaydto;
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.MetalVsDay;

@Service
public class MetalVsDayService {
    


    @Autowired
    private Raipur.Metaliks.example.Raipur.Metaliks.Repository.MetalVsDayReposiotry metalVsDayRepository;

    public MetalVsDay createMetalVsDay(MetalVsDaydto metalVsDaydto) {
        MetalVsDay metalVsDay = new MetalVsDay();
        metalVsDay.setDate(metalVsDaydto.getDate());
        metalVsDay.setMetalType(metalVsDaydto.getMetalType());
        metalVsDay.setPrice(metalVsDaydto.getPrice());

        return metalVsDayRepository.save(metalVsDay);
    }

    public List<MetalVsDay> getAllMetalVsDayRecords() {
        return metalVsDayRepository.getAllMetalVsDayRecords();
    }
}
