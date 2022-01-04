package com.bridgelabz.AddressBookNew.repository;

import com.bridgelabz.AddressBookNew.model.PersonData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<PersonData, Integer> {

}
