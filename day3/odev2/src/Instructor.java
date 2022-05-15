public class Instructor extends User {

    private String courseDetails;
    
    public Instructor(int id, String name, String lastName, String email, String password) {
        super(id, name, lastName, email, password);
        
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
    }
}