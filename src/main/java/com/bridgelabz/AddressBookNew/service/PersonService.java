package com.bridgelabz.AddressBookNew.service;

import com.bridgelabz.AddressBookNew.dto.PersonDTO;
import com.bridgelabz.AddressBookNew.model.PersonData;
import com.bridgelabz.AddressBookNew.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements  IPersonService {
    @Autowired
    private IPersonRepository personRepository;

    @Override
    public List<PersonData> getPersonData() {
        return personRepository.findAll();
    }

    @Override
    public PersonData getPersonDataById(int pId) {
        return personRepository.findById(pId).get();
    }

    @Override
    public PersonData createPersonData(PersonDTO personDTO) {
        PersonData personData = new PersonData(personDTO);
        return personRepository.save(personData);
    }

    @Override
    public PersonData updatePersonData(int pId, PersonDTO personDTO) {
        PersonData personData  = this.getPersonDataById(pId);
        personData .updatePersonData(personDTO);
        return personRepository.save(personData);

    }

    @Override
    public void deletePersonData(int id) {
        PersonData personData  = this.getPersonDataById(id);
        personRepository.delete(personData );
    }
}
