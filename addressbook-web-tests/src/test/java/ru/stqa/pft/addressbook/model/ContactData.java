package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String name;
    private final String middleName;
    private final String lastName;
    private final String company;
    private final String adrress;

    public ContactData(String name, String middleName, String lastName, String company, String adrress) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.company = company;
        this.adrress = adrress;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAdrress() {
        return adrress;
    }
}
