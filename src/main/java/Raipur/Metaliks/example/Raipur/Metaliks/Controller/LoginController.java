package Raipur.Metaliks.example.Raipur.Metaliks.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Raipur.Metaliks.example.Raipur.Metaliks.DTO.Logindto;
import Raipur.Metaliks.example.Raipur.Metaliks.Service.Loginservice;

@RestController
@RequestMapping(path="/api")
@CrossOrigin(origins = "*") 
public class LoginController {
    
    @Autowired
    private Loginservice loginservice;
    
    @PostMapping("/login") 
    public String checkLogin(@RequestBody Logindto logindto)
    {
        return loginservice.checkLogin(logindto);
    }
}
