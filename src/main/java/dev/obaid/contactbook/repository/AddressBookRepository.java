package dev.obaid.contactbook.repository;

import dev.obaid.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class AddressBookRepository implements AddressBook {
    List<Contact> contactList = new ArrayList<>();

    public Optional<String> add(Contact contact) {
        boolean contactExists = contactList.stream().anyMatch(c -> c.equals(contact));
        return (contactExists) ? Optional.of("The provided contact is already exists!") : Optional.of("contact details has been successfully added!");
    }

    public Optional<Contact> getByName(String name) {
        return Optional.empty();
    }

    public List<Contact> getAll() {
        return contactList;
    }
}
