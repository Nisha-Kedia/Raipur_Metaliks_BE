package Raipur.Metaliks.example.Raipur.Metaliks.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Raipur.Metaliks.example.Raipur.Metaliks.DTO.Dealerdto;
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Dealer;
import Raipur.Metaliks.example.Raipur.Metaliks.Repository.DealerRepository;

@Service
public class Dealerservice {
    @Autowired
    private DealerRepository dealerRepository;

    public Dealer createDealer(Dealerdto dealerdto){
        Dealer dto = new Dealer();
        // dto.setId(buyerdto.getId());
        dto.setName(dealerdto.getName());
        dto.setPhoneNo(dealerdto.getPhoneNo());
        dto.setPrice(dealerdto.getPrice());
        dto.setProduct(dealerdto.getProduct());

        Dealer dtolistDealer = dealerRepository.save(dto);
        return dtolistDealer;
    }
    public List<Dealer> getallDealers(){
        return dealerRepository.getallDealers();
    }
}
