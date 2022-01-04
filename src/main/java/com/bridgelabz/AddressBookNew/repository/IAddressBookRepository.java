package com.bridgelabz.AddressBookNew.repository;

import com.bridgelabz.AddressBookNew.dto.AddressBookDTO;
import com.bridgelabz.AddressBookNew.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressBookRepository extends JpaRepository<AddressBookData,Integer> {
}
