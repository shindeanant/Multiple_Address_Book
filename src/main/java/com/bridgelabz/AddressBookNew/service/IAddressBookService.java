package com.bridgelabz.AddressBookNew.service;

import com.bridgelabz.AddressBookNew.dto.AddressBookDTO;
import com.bridgelabz.AddressBookNew.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int addressBookId);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int addressBookId, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int addressBookId);
}
