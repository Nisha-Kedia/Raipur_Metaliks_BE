package Raipur.Metaliks.example.Raipur.Metaliks.Service;

import java.util.List;

import Raipur.Metaliks.example.Raipur.Metaliks.DTO.Buyerdto;
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Buyer;
import Raipur.Metaliks.example.Raipur.Metaliks.Repository.BuyerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Buyerservice {
    @Autowired
    private BuyerRepository buyerRepository;
    
    public Buyer createBuyer(Buyerdto buyerdto){
        Buyer dto = new Buyer();
        // dto.setId(buyerdto.getId());
        dto.setName(buyerdto.getName());
        dto.setPhoneNo(buyerdto.getPhoneNo());
        dto.setPrice(buyerdto.getPrice());
        dto.setProduct(buyerdto.getProduct());
        dto.setQuantity(buyerdto.getQuantity());
        dto.setStatus(buyerdto.getStatus());

        Buyer dtolistBuyer = buyerRepository.save(dto);
        return dtolistBuyer;
    }
    public List<Buyer> getallBuyers(){
        return buyerRepository.getallBuyers();
    }
}
