public class StudentManager extends UserManager{

    public void editName(Student student) {
        String newName="burak!!";// input almak yasak olduğu için yeni değişken tanımladım bunu input alınmış hali olarak düşünebiliriz.
        student.setName(newName);
        System.out.println(student.getName()+" yeni isminizdir");
    }

    public void editLastName(Student student) {
        String newLastName="gül!!";// input almak yasak olduğu için yeni değişken tanımladım bunu input alınmış hali olarak düşünebiliriz.
        student.setLastName(newLastName);
        System.out.println(student.getLastName()+" yeni soy isminizdir");
    }

    public void addAdress(Student student) {
        String newAdress="Bursa Teknik Üniversitesi!!";
        
        student.setAddress(newAdress);// input almak yasak olduğu için yeni değişken tanımladım bunu input alınmış hali olarak düşünebiliriz.
        System.out.println(student.getAddress()+" yeni adresinizdir");
    }

    public void deleteAdress(Student student) {
        String newAdress="------------";//adresi sıfırladık gibi düşünebiliriz
        
        student.setAddress(newAdress);// input almak yasak olduğu için yeni değişken tanımladım bunu input alınmış hali olarak düşünebiliriz.
        System.out.println("adresiniz silindi "+student.getAddress()+" yeni adresinizdir");
    }

    public void addPhoneNumber(Student student){
        String newPhoneNumber="0555 444 33 22";// input almak yasak olduğu için yeni değişken tanımladım bunu input alınmış hali olarak düşünebiliriz.ve böyle bir numara yoktur galiba
        student.setContact(new Contact(newPhoneNumber));;
        
        System.out.println(student.getContact().getPhoneNumber()+"yeni telefon numaranızdır");
    }

    public void DeletePhoneNumber(Student student){
        String newPhoneNumber="---- --- -- --";//telefon numarasını sıfırladık gibi düşünelim
        student.getContact().setPhoneNumber(newPhoneNumber);
        System.out.println("telefon numaranız silinmiştir "+student.getContact().getPhoneNumber());
    }
}
