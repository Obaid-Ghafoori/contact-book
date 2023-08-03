package dev.obaid.contactbook.repository;

import dev.obaid.contactbook.model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class AddressBookRepository implements AddressBook {
    List<Contact> contactList = new ArrayList<>();

    public Optional<Contact> add(Contact contact) {
        if (contactList.stream().anyMatch(c -> c.equals(contact))) {
            return Optional.empty();
        }
        contactList.add(contact);
        return Optional.of(contact);
    }

    public Optional<Contact> getByName(String name) {
        Optional<Contact> contactWithNameExist = contactList.stream()
                .filter(contact -> contact.getName().equals(name))
                .findFirst();

        return contactWithNameExist;
    }

    public List<Contact> getAll() {
        return contactList;
    }
}
