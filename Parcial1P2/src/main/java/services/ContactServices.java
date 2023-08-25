package services;

import domain.enums.ContactType;
import domain.models.Contact;

import java.util.List;

public interface ContactServices {
    List<Contact> getAllContact(List<Contact> contacts);
    Contact addContact(Long id, String name, ContactType type, String email, String phone);

    List<Contact> listbyCategory(List<Contact> contacts, ContactType type);

    Long countByCategory(List<Contact> contacts, ContactType type);
    List<Contact> listByNameEmail(List<Contact> contacts, String name, String email);

}
