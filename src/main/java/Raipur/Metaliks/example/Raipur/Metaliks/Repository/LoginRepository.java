package Raipur.Metaliks.example.Raipur.Metaliks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long>{
    public Login findByUsername(String username);
    public Login findByPassword(String password);
}
