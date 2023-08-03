package dev.obaid.contactbook;

import dev.obaid.contactbook.controller.AddressBookController;
import dev.obaid.contactbook.model.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ContactBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactBookApplication.class, args);
        AddressBookController addressBookController = new AddressBookController();

        addressBookController.addContact(Contact.builder()
                .name("Jad")
                .phoneNumber("80997234576")
                .email(Optional.ofNullable("email@email.com"))
                .build());

         addressBookController.addContact(Contact.builder()
                .name("Bob")
                .phoneNumber("80997234576")
                .email(Optional.ofNullable("email@email.com"))
                .build());

         addressBookController.addContact(Contact.builder()
                .name("Tom")
                .phoneNumber("80997234576")
                .email(Optional.ofNullable("email@email.com"))
                .build());

         Optional<Contact> jad = addressBookController.searchContactByName("Jad");

        System.out.println();
        System.out.println("---------- Contact List ----------");
		addressBookController.getAllContacts().forEach(contact -> System.out.println("\t\tContact Name: "+ contact.getName()));
        System.out.println("-------- End Of the List ---------");
        System.out.println("\t\t\t\t_ ");
        System.out.println("\t\t\t\t|");
        System.out.println("\t\t\t\tv");


        jad.ifPresent(contact -> {
            String contactInfo = contact.toString();
            String contactDetails = contactInfo.substring(contactInfo.indexOf("(") +1, contactInfo.length() -1);
            System.out.println(contactDetails);
        });

	}

}
