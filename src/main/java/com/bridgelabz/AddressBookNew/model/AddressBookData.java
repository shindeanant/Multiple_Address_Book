package com.bridgelabz.AddressBookNew.model;

import com.bridgelabz.AddressBookNew.dto.AddressBookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@ToString
@NoArgsConstructor
public class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "book_id")
    private int bookId;

    private String addressBookName;

    /**
     * public AddressBookData(int bookId, String addressBookName) { this.bookId =
     * bookId; this.addressBookName = addressBookName; }
     */

    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.bookId = addressBookDTO.bookId;
        this.addressBookName=addressBookDTO.addressBookName;
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        // this.addressBookName = addressBookDTO.addressBookName;
    }
}
