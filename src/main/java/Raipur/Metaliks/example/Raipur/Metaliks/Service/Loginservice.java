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
        Login checkUser= loginRepository.findByUsername(dto.getUsername());
        String checkPassword = dto.getPassword();
        String checkUsername = checkUser.getUsername().toString();

        String success = "User Login Succesfull";
        String failure = "User Login Failed";
        String username = dto.getUsername();
        
        if(checkUsername.equals(username))
        {
            Login pass = loginRepository.findByPassword(dto.getPassword());
             String password = pass.getPassword().toString();
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
