import domain.enums.ContactType;
import domain.models.Contact;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import services.impl.ContactServicesimpl;
public class Main {
    public static void main(String[] args){

        Contact contact1 = new Contact(1L, "John", ContactType.FRIEND, "John@mail.com","123");
        Contact contact2 = new Contact(2L, "Mike", ContactType.FAMILY, "Mike@mail.com","456");
        Contact contact3 = new Contact(3L, "Bri", ContactType.WORK, "Bri@mail.com","789");

        List<Contact> contacts = new ArrayList<Contact>();

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        ContactServicesimpl CoSer = new ContactServicesimpl();
        String option = "0";
        do{

            System.out.println("\n Menu:" +
                    "\n1. List all Contacts" +
                    "\n2. Add Contact" +
                    "\n3. List by Category" +
                    "\n4. Count by Category" +
                    "\n5. List by Category with name and email" +
                    "\n6. Exit");
            Scanner scan = new Scanner(System.in);
            option = scan.next();
            switch(option){
                case "1": {
                    System.out.println(CoSer.getAllContact(contacts));
                    break;
                }
                case "2": {
                    System.out.println("Add your contact: id:");
                    Long id = scan.nextLong();
                    System.out.println("name:");
                    String name = scan.next();
                    System.out.println("type: family, work, friend");
                    String type = scan.next();
                    System.out.println("email:");
                    String email = scan.next();
                    System.out.println("phone:");
                    String phone = scan.next();
                    if(type.equals("family")){
                        Contact contactAdded = CoSer.addContact(id, name, ContactType.FAMILY, email, phone );
                        contacts.add(contactAdded);
                    }else if(type.equals("work")) {
                        Contact contactAdded = CoSer.addContact(id, name, ContactType.WORK, email, phone );
                        contacts.add(contactAdded);
                    }else if(type.equals("friend")){
                        Contact contactAdded = CoSer.addContact(id, name, ContactType.FRIEND, email, phone );
                        contacts.add(contactAdded);
                    }
                    break;
                }
                case "3": {
                    System.out.println("Type your category: family, work, friend");
                    String type = scan.next();
                    System.out.println(type);
                    if (type.equals("family")) {
                        System.out.println(CoSer.listbyCategory(contacts, ContactType.FAMILY));
                    } else if (type.equals("work")) {
                        System.out.println(CoSer.listbyCategory(contacts, ContactType.WORK));
                    } else if (type.equals("friend")) {
                        System.out.println(CoSer.listbyCategory(contacts, ContactType.FRIEND));
                    }
                    break;
                }
                case "4":{
                    System.out.println("Type your category: family, work, friend");
                    String type = scan.next();
                    System.out.println(type);
                    if (type.equals("family")) {
                        System.out.println(CoSer.countByCategory(contacts, ContactType.FAMILY));
                    } else if (type.equals("work")) {
                        System.out.println(CoSer.countByCategory(contacts, ContactType.WORK));
                    } else if (type.equals("friend")) {
                        System.out.println(CoSer.countByCategory(contacts, ContactType.FRIEND));
                    }
                    break;
                }
                case "5":{
                    System.out.println("Type your name: ");
                    String name = scan.next();
                    System.out.println("Type your email: ");
                    String email = scan.next();
                    System.out.println(CoSer.listByNameEmail(contacts, name, email));
                    break;
                }
            }
        }while (!option.equals("6"));

    }
}
