package domain.models;

import domain.enums.ContactType;

public class Contact {
    private Long id;
    private String name;
    private ContactType type;
    private String email;
    private String phone;

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Contact(Long id, String name, ContactType type, String email, String phone) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.phone = phone;
    }

    public Contact() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
