package ru.stqa.pft.addressbook.model;

public class ContactData {
    private int id;
    private final String firstName;
    private final String lastName;
    private final String Phone;
    private final String mail;
    private String address;
    private String group;

    public ContactData(String firstName, String lastName, String Phone, String mail, String address, String group) {
        this.id = Integer.MAX_VALUE;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Phone = Phone;
        this.mail = mail;
        this.address = address;

        this.group = group;
    }

    public ContactData(int id, String firstName, String lastName, String Phone, String mail, String address, String group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Phone = Phone;
        this.mail = mail;
        this.address = address;
        this.group = group;
    }


    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public String getGroup() {
        return group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "address='" + address + '\'' +
                ", group='" + group + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (id != that.id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        return group != null ? group.equals(that.group) : that.group == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}