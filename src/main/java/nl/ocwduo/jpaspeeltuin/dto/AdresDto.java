package nl.ocwduo.jpaspeeltuin.dto;

import lombok.Data;

@Data
public class AdresDto {
    private Long id;
    private String zipCode;
    private String streetName;
    private Long houseNumber;
    private Long personId;
}
