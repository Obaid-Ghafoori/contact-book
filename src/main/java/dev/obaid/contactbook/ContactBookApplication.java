package dev.obaid.contactbook;

import dev.obaid.contactbook.model.AddressBookDto;
import dev.obaid.contactbook.model.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ContactBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactBookApplication.class, args);
        AddressBookDto addressBook = new AddressBookDto();
//		List<Contact> contactList = new ArrayList<>();
        List<Contact> contactList = addressBook.getContactList();

        contactList.add(Contact.builder()
                .name("Bob")
                .phoneNumber("80997234576")
                .email(Optional.ofNullable("email@email.com"))
                .build());

        contactList.add(Contact.builder()
                .name("Tom")
                .phoneNumber("80997234576")
                .email(Optional.ofNullable("email@email.com"))
                .build());

        System.out.println("");
        System.out.println("---------- Contact List ----------");
		contactList.stream().forEach(contact -> System.out.println("\t\tContact Name: "+ contact.getName()));
        System.out.println("-------- End Of the List ---------");

	}

}
