package Raipur.Metaliks.example.Raipur.Metaliks.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contactdto {
    private Long id;
    private String name;
    private String email;
    private Long phoneNo;
    private String subject;
    private String message;
}
