package com.bridgelabz.AddressBookNew.model;

import com.bridgelabz.AddressBookNew.dto.PersonDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person_details")
public class PersonData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "person_id")
    private int personId;
    private String fName;
    private String lName;
    private String gender;
    private String phoneNum;
    private String email;
    private String address;
    private String city;
    private String state;
    private String country;
    private String profilePic;

    public PersonData() {
    }
    public PersonData(PersonDTO personDTO) {
        	this.updatePersonData(personDTO);
    }

    public void updatePersonData(PersonDTO personDTO) {
        this.fName = personDTO.fName;
        this.lName = personDTO.lName;
        this.gender = personDTO.gender;
        this.profilePic = personDTO.profilePic;
        this.phoneNum = personDTO.phoneNum;
        this.email = personDTO.email;
        this.address = personDTO.address;
        this.city = personDTO.city;
        this.state = personDTO.state;
        this.country = personDTO.country;

    }

}
