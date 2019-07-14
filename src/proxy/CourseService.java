package proxy;

public class CourseService implements ICourseService {
    private Course course;

    public CourseService(){
        System.out.println("执行无参构造函数");
    }

    public CourseService(Course course){
        this.course = course;
        System.out.println("执行有参构造函数");
    }
    @Override
    public void selectCourse(Course course) {
        System.out.println("you have select "+course.getName());
    }

    @Override
    public void auditCourse(Course course) {
        System.out.println("you have auditCourse "+course.getName());

    }

    @Override
    public void openCourse(Course course) {
        System.out.println("you have openCourse "+course.getName());

    }
}
