package Raipur.Metaliks.example.Raipur.Metaliks.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{
    @Query(nativeQuery = true,value="SELECT * FROM contact")
    List<Contact> getallContacts();
}