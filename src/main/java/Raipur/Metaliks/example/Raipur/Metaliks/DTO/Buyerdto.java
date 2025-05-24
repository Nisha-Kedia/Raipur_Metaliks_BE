package Raipur.Metaliks.example.Raipur.Metaliks.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Buyerdto {
    private Long id;
    private String name;
    private Long phoneNo;   
    private Long quantity;
    private Float price;
    private String product;
    private String status;
}

