package Raipur.Metaliks.example.Raipur.Metaliks.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Raipur.Metaliks.example.Raipur.Metaliks.DTO.Logindto;
import Raipur.Metaliks.example.Raipur.Metaliks.Entity.Login;
import Raipur.Metaliks.example.Raipur.Metaliks.Repository.LoginRepository;

@Service
public class Loginservice {
    @Autowired
    private LoginRepository loginRepository;

    public String checkLogin(Logindto dto){
        // Login checkUsername = loginRepository.findByUsername(dto.getUsername());
        String checkPassword = dto.getPassword();
        String checkUsername = dto.getPassword();

        String success = "User Login Succesfull";
        String failure = "User Login Failed";
        String username = "admin123";

        if(username.equals(checkUsername))
        {
            String password = "admin123";

            if(password.equals(checkPassword))
            {
                return success;
            }
            else
            {
                return failure;
            }
        }
        else{
            return "Username not found";
        }
    }
}
