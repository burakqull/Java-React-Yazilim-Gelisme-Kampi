public class Student extends User{
    
    private String address;
    private Contact contact;
    
    public Student(int id, String name, String lastName, String email, String password) {
        super(id, name, lastName, email, password);
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Contact getContact() {
        return contact;
    }
    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
