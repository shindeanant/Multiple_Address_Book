package com.bridgelabz.AddressBookNew.service;

import com.bridgelabz.AddressBookNew.dto.AddressBookDTO;
import com.bridgelabz.AddressBookNew.model.AddressBookData;
import com.bridgelabz.AddressBookNew.repository.IAddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressBookService implements  IAddressBookService{
    @Autowired
     private  IAddressBookRepository addressBookRepository;
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int addressBookId) {
        return addressBookRepository.findById(addressBookId).get();
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }


    @Override
    public AddressBookData updateAddressBookData(int addressBookId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDataById(addressBookId);
        addressBookData.updateAddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }


    @Override
    public void deleteAddressBookData(int addressBookId) {
        AddressBookData addressBookData = this.getAddressBookDataById(addressBookId);
        addressBookRepository.delete(addressBookData);
    }
}
