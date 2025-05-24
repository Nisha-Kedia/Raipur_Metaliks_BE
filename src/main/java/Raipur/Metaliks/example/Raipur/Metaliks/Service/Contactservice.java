package Raipur.Metaliks.example.Raipur.Metaliks.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Raipur.Metaliks.example.Raipur.Metaliks.DTO.Contactdto;
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Contact;
import Raipur.Metaliks.example.Raipur.Metaliks.Repository.ContactRepository;

@Service
public class Contactservice {
    @Autowired
    private ContactRepository contactRepository;

    public Contact createContact(Contactdto contactdto){
        Contact dto= new Contact();
        dto.setName(contactdto.getName());
        dto.setPhoneNo(contactdto.getPhoneNo());
        dto.setEmail(contactdto.getEmail());
        dto.setMessage(contactdto.getMessage());
        dto.setSubject(contactdto.getSubject());

        Contact dtolistContact=contactRepository.save(dto);
        return dtolistContact;
    }
    public List<Contact> getallContacts()
    {
        return contactRepository.getallContacts();
    }
}
