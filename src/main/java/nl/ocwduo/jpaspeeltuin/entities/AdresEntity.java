package nl.ocwduo.jpaspeeltuin.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class AdresEntity implements Serializable {
    @Id
    private Long id;
    private String zipCode;
    private String streetName;
    private Long houseNumber;
    private Long personId;
}
