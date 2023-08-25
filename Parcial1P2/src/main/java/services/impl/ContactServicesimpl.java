package services.impl;


import domain.enums.ContactType;
import domain.models.Contact;
import services.ContactServices;


import java.util.List;

public class ContactServicesimpl implements ContactServices {
    @Override
    public List<Contact> getAllContact(List<Contact> contacts) {
        return contacts;
    }

    @Override
    public Contact addContact(Long id, String name, ContactType type, String email, String phone) {
        Contact contact = new Contact(id, name, type, email, phone);
        System.out.println(contact);
        return contact;
    }

    @Override
    public List<Contact> listbyCategory(List<Contact> contacts, ContactType type) {
        return contacts.stream()
                .filter(c -> c.getType().equals(type))
                .toList();
    }

    @Override
    public Long countByCategory(List<Contact> contacts, ContactType type) {
        return contacts.stream()
                .filter(c -> c.getType().equals(type))
                .count();
    }

    @Override
    public List<Contact> listByNameEmail(List<Contact> contacts, String name, String email) {
        return contacts.stream()
                .filter(c -> c.getName().equals(name))
                .filter(c -> c.getEmail().equals(email))
                .toList();
    }

}
