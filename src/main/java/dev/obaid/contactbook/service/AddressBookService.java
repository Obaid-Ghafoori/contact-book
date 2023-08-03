package dev.obaid.contactbook.service;

import dev.obaid.contactbook.model.Contact;
import dev.obaid.contactbook.repository.AddressBookRepository;

import java.util.List;
import java.util.Optional;


public class AddressBookService {
    private final AddressBookRepository contactRepository= new AddressBookRepository();

    public void addContact(Contact contact) {
        contactRepository.add(contact);
    }

    public Optional<Contact> searchContactByName(String name) {
        return contactRepository.getByName(name);
    }

    public List<Contact> getAllContacts() {
        return contactRepository.getAll();
    }

}
