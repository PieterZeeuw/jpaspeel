package nl.ocwduo.jpaspeeltuin.dto;

import lombok.Data;

@Data
public class PersonDto {
    private Long id;
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private AdresDto adresDto;
}
