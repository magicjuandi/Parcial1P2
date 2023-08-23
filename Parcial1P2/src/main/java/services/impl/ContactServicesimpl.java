package services.impl;


import domain.enums.ContactType;
import domain.models.Contact;
import services.ContactServices;

import java.util.ArrayList;
import java.util.List;

public class ContactServicesimpl implements ContactServices {
    @Override
    public List<Contact> getAllContact(List<Contact> contacts) {
        return contacts;
    }

    @Override
    public Contact addContact(Long id, String name, ContactType type, String email, String phone) {
        Contact contact = new Contact(id, name, type, email, phone);
        contact.toString();
        System.out.println(contact);
        return contact;
    }

    @Override
    public List<Contact> listbyCategory(List<Contact> contacts, ContactType type) {
        return contacts.stream()
                .filter(c -> c.getType().equals(type))
                .toList();
    }

}
