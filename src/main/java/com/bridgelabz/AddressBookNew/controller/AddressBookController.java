package com.bridgelabz.AddressBookNew.controller;

import com.bridgelabz.AddressBookNew.dto.AddressBookDTO;
import com.bridgelabz.AddressBookNew.dto.ResponseDTO;
import com.bridgelabz.AddressBookNew.model.AddressBookData;
import com.bridgelabz.AddressBookNew.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping("/getAll")
    public ResponseEntity<ResponseDTO> getAllAddressBookData() {
        List<AddressBookData> addressBookList = null;
        addressBookList = addressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get call success", addressBookList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBookData(@RequestParam int addressBookId) {
        AddressBookData personDetails = null;
        personDetails= addressBookService.getAddressBookDataById(addressBookId);
        ResponseDTO respDTO = new ResponseDTO("Get call success for id:" + addressBookId, personDetails);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData createBook = null;
        createBook = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("created address book successfully", createBook);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestParam int addressBookId,@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData createBook = null;
        createBook = addressBookService.updateAddressBookData(addressBookId,addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("created address book successfully", createBook);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @DeleteMapping("/remove")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@RequestParam int addressBookId) {
        addressBookService.deleteAddressBookData(addressBookId);
        ResponseDTO respDTO = new ResponseDTO("Deleted AddressBook data Successfully", "deleted addressbookId is :" + addressBookId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

}
