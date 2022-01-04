package com.bridgelabz.AddressBookNew.controller;

import com.bridgelabz.AddressBookNew.dto.PersonDTO;
import com.bridgelabz.AddressBookNew.dto.ResponseDTO;
import com.bridgelabz.AddressBookNew.model.PersonData;
import com.bridgelabz.AddressBookNew.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persondb")
public class PersonController {
    @Autowired
    private IPersonService personService;

    @RequestMapping(value = "/get")
    public ResponseEntity<ResponseDTO> getPersonData(){
        List<PersonData> personList =null;
        personList = personService.getPersonData();
        ResponseDTO respDTO = new ResponseDTO("Get call successfull", personList);
        return  new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

    }
    @GetMapping("/get/{pId}")
    public ResponseEntity<ResponseDTO> getPersonData(@PathVariable("pId") int pId) {
        PersonData personData = null;
        personData = personService.getPersonDataById(pId);
        ResponseDTO respDTO = new ResponseDTO("Get Call for Id Successful", personData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createPersonData(@RequestBody PersonDTO presonDTO) {
        PersonData personData = null;
        personData = personService.createPersonData(presonDTO);
        ResponseDTO respDTO = new ResponseDTO("Created person data Successfully", personData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PutMapping("/update/{pId}")
    public ResponseEntity<ResponseDTO> updatePersonData(@PathVariable("pId") int pId, @RequestBody PersonDTO personDTO) {
        PersonData personData = null;
        personData = personService.updatePersonData(pId, personDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated AddressBook data Successfully", personData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @DeleteMapping("/remove/{pId}")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("pId") int pId) {
        personService.deletePersonData(pId);
        ResponseDTO response = new ResponseDTO("Delete call success for id ", "deleted id:" + pId);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

}
