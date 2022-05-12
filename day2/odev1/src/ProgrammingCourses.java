public class  ProgrammingCourses {

    public ProgrammingCourses(int id,String name,String courseInstructor,int courseDuration,String courseLanguage){
        this.id = id;
        this.name = name;
        this.courseInstructor = courseInstructor;
        this.courseDuration =courseDuration;
        this.courseLanguage = courseLanguage;
        System.out.println("constructor calisti");
    }


    int id;
    String name;
    String courseInstructor;
    int courseDuration;
    String courseLanguage;
    
}
