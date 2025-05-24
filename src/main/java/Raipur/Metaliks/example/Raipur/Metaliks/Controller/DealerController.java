package Raipur.Metaliks.example.Raipur.Metaliks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Raipur.Metaliks.example.Raipur.Metaliks.DTO.Dealerdto;
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Dealer;
import Raipur.Metaliks.example.Raipur.Metaliks.Service.Dealerservice;

@RestController
@RequestMapping(path ="/api")

public class DealerController {
    @Autowired
    private Dealerservice dealerservice;

    @PostMapping("/DealerForm")
    public Dealer createfromDealer(@RequestBody Dealerdto dealerdto){
        return dealerservice.createDealer(dealerdto);
    }
    @GetMapping("/getdealers")
    public List<Dealer> getallDealers(){
        return dealerservice.getallDealers();
    }
}
