package Model;

public class Person {

    private Long id;
    private String FirstName;
    private String LastName;
    private String NationalCode;
    private String Phone;
    private String Address;

    public Person() {
    }

    public Person(Long id, String firstName, String lastName, String nationalCode, String phone, String address) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        NationalCode = nationalCode;
        Phone = phone;
        Address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNationalCode() {
        return NationalCode;
    }

    public void setNationalCode(String nationalCode) {
        NationalCode = nationalCode;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", NationalCode='" + NationalCode + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
