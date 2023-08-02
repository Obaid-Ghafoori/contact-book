package dev.obaid.contactbook.repository;

import dev.obaid.contactbook.model.Contact;

import java.util.List;
import java.util.Optional;

public interface AddressBook {
    Optional<String> add(Contact contact);

    Optional<Contact> getByName(String name);

    List<Contact> getAll();
}
