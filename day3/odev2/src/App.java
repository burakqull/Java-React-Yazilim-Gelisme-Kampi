public class App {
    public static void main(String[] args) throws Exception {

        User user1= new User(1, "emirhan", "baran", "emirhanbaran@gmail.com", "678910");
        Student student1 = new Student(2, "burak", "gül", "burakgül@gmail.com", "12345");
        Instructor instructor1=new Instructor(3, "ibrahim ", "özer",    "ibrahimözer@gmail.com",    "1112131415");

        UserManager userManager = new UserManager();
        userManager.login(user1);
        userManager.logout(user1);
        userManager.changePassword(user1);
        userManager.editEmail(user1);
        


        

        StudentManager studentManager = new StudentManager();
        studentManager.addAdress(student1);
        studentManager.addPhoneNumber(student1);
        studentManager.DeletePhoneNumber(student1);
        studentManager.changePassword(student1);
        studentManager.deleteAdress(student1);
        studentManager.editEmail(student1);
        studentManager.editLastName(student1);
        studentManager.editName(student1);
        studentManager.login(student1);
        studentManager.logout(student1);

        InstructorManager iManager=new InstructorManager();
        iManager.addNewCourse(new Course("java and react yazılım kursu"));
        iManager.changePassword(instructor1);
        iManager.editEmail(instructor1);
        iManager.login(instructor1);
        iManager.logout(instructor1);
        

    






    }
}
