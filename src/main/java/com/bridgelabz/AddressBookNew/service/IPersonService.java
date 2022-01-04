package com.bridgelabz.AddressBookNew.service;

import com.bridgelabz.AddressBookNew.dto.PersonDTO;
import com.bridgelabz.AddressBookNew.model.PersonData;

import java.util.List;

public interface IPersonService {
    List<PersonData> getPersonData();
    PersonData getPersonDataById(int id);
    PersonData createPersonData(PersonDTO personDTO);
    PersonData updatePersonData(int id, PersonDTO personDTO);
    void deletePersonData(int id);

}
