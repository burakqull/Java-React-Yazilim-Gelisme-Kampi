public class App {
    public static void main(String[] args) throws Exception {

        
        ProgrammingCourses[] courses={

            new ProgrammingCourses(1,"Yazılım Geliştirme Kampı(JAVA + REACT)","Engin DEMİROĞ",60,"Java + React"),
            new ProgrammingCourses(2,"Yazılım Geliştirme Kampı (JavaScript)","Engin DEMİROĞ",45,"JavaScript + Angular")
        };

        for (ProgrammingCourses programmingCourses : courses) {
            System.out.println("Programın adı :"+programmingCourses.name + " Programın dili : "+programmingCourses.courseLanguage);
        }


        CourseManager courseManager = new CourseManager();
        courseManager.programaDahilOl();
        courseManager.bitirVeDevamEt();
        courseManager.oncekiDers();



    }
}
