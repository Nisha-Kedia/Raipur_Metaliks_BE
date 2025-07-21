package Raipur.Metaliks.example.Raipur.Metaliks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Raipur.Metaliks.example.Raipur.Metaliks.DTO.Buyerdto;
import Raipur.Metaliks.example.Raipur.Metaliks.DTO.MetalVsDaydto;
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Buyer;
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.MetalVsDay;

@RestController
@RequestMapping(path = "/api")
public class MetalVsDayController {
    
    @Autowired
    private Raipur.Metaliks.example.Raipur.Metaliks.Service.MetalVsDayService metalVsDayService;

    @PostMapping("/metalvsday")
    public MetalVsDay createMetalVsDay(@RequestBody MetalVsDaydto metalVsDaydto) {
        return metalVsDayService.createMetalVsDay(metalVsDaydto);
    }

    @GetMapping("/getmetalvsday")
    public List<MetalVsDay> getAllMetalVsDayRecords() {
        return metalVsDayService.getAllMetalVsDayRecords();
    }
}
