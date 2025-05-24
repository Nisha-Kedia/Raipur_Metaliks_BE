package Raipur.Metaliks.example.Raipur.Metaliks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Raipur.Metaliks.example.Raipur.Metaliks.DTO.Contactdto;
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Contact;
import Raipur.Metaliks.example.Raipur.Metaliks.Service.Contactservice;

@CrossOrigin(origins = "*")   
@RestController
@RequestMapping(path="/api")
public class ContactController {

    @Autowired
    private Contactservice contactservice;

    @PostMapping("/contacts")
    public Contact createContact(@RequestBody Contactdto contactdto){
        return contactservice.createContact(contactdto);
    }

    @GetMapping("/getcontact")
    public List<Contact> getallContacts(){
        return contactservice.getallContacts();
    }
}
