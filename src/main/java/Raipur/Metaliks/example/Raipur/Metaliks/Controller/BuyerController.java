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
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Buyer;
import Raipur.Metaliks.example.Raipur.Metaliks.Service.Buyerservice;

@RestController
@RequestMapping(path = "/api")
public class BuyerController{

    @Autowired
    private Buyerservice buyerservice;

    @PostMapping("/Buyerform")
    public Buyer createFormBuyer(@RequestBody Buyerdto buyerdto){
        return buyerservice.createBuyer(buyerdto);
    }
    @GetMapping("/getbuyers")
    public List<Buyer> getallBuyers(){
        return buyerservice.getallBuyers();
    }
}
