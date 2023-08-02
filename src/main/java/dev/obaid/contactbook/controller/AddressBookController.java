package dev.obaid.contactbook.controller;

import dev.obaid.contactbook.model.Contact;
import dev.obaid.contactbook.service.AddressBookService;


import java.util.Optional;

public class AddressBookController {
    public AddressBookService addressBookService;

    public void addContact(Contact contact){
        addressBookService.addContact(contact);
    }

    public Optional<Contact> searchContactByName(String name){
        return addressBookService.searchContactByName(name);
    }
}
